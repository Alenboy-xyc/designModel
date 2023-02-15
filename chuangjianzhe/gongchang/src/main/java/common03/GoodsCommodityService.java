package common03;

import common01.DeliverReq;
import common01.GoodsService;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
public class GoodsCommodityService implements ICommodity{
    private GoodsService goodsService = new GoodsService();
    @Override
    public void SendCommodity(String uid, String commodity, String bizId) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName("shanzhu");
        deliverReq.setUserPhone("123131");
        deliverReq.setOrderId(bizId);
        deliverReq.setSku(commodity);
        Boolean aBoolean = goodsService.deliverGoods(deliverReq);
    }
}
