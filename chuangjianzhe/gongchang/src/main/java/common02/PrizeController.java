package common02;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import common01.*;

/**
 * @author shanzhu
 * @description 没使用设计模式，ifelse实现
 * @create 2023/2/15
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);
    public AwardRes awardToUser(AwardReq req) {
        AwardRes res = null;
        try {
            logger.debug("start");
            //1、优惠卷，2、实物商品，3、第三方兑换卡
            if (req.getAwardType() == 1) {
                logger.debug("1");
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sndCoupon(req.getUid(), req.getCouponNumber(), req.getUuid());
                if ("0000".equals(couponResult.getCode())) {
                    res = new AwardRes("0000", "发送成功");
                } else {
                    res = new AwardRes("0001", couponResult.getInfo());
                }
            }else if (req.getAwardType() == 2) {
                logger.debug("2");
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getUid()));
                deliverReq.setUserPhone(queryUserPhone(req.getUid()));
                deliverReq.setSku(req.getCouponNumber());
                deliverReq.setOrderId(req.getUuid());
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    res = new AwardRes("0000", "发放成功");
                }else {
                    res = new AwardRes("0001", "发放失败");
                }
            }else if (req.getAwardType() == 3) {
                logger.debug("3");
                String phone = queryUserPhone(req.getUid());
                IQIYIService service = new IQIYIService();
                service.grantToken(phone, req.getCouponNumber());
                res = new AwardRes("0000", "发放成功");
            }
        }catch (Exception e) {
            res = new AwardRes("0001", e.getMessage());
        }
        return res;
    }
    public String queryUserName(String uid) {
        return "张三";
    }
    public String queryUserPhone(String uid) {
        return "1231313123";
    }
}
