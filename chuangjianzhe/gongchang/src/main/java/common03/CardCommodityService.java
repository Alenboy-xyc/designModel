package common03;

import common01.IQIYIService;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
public class CardCommodityService implements ICommodity{
    private IQIYIService service = new IQIYIService();
    @Override
    public void SendCommodity(String uid, String commodity, String bizId) {
        service.grantToken("2313131", bizId);
    }
}
