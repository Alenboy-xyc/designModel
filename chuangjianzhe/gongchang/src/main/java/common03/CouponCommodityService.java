package common03;

import common01.CouponResult;
import common01.CouponService;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
public class CouponCommodityService implements ICommodity{
    private CouponService service = new CouponService();
    @Override
    public void SendCommodity(String uid, String commodity, String bizId) {
        CouponResult couponResult = service.sndCoupon(uid, commodity, bizId);
    }
}
