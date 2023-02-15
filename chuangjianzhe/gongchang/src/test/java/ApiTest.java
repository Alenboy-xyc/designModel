import common02.AwardReq;
import common02.AwardRes;
import common02.PrizeController;
import common03.ICommodity;
import common03.StoreFactory;
import org.junit.Test;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
public class ApiTest {
    @Test
    public void test() {
        PrizeController prizeController = new PrizeController();
        AwardReq req = new AwardReq();
        req.setAwardType(1);
        req.setUid("10001");
        req.setCouponNumber("dankbhadadbakdamdnawkwdkad");
        req.setUuid("123123131313");
        AwardRes awardRes = prizeController.awardToUser(req);
        System.out.println(awardRes);
    }

    @Test
    public void test2() {
        StoreFactory storeFactory = new StoreFactory();
        ICommodity commodityService1 = storeFactory.getCommodityService(1);
        commodityService1.SendCommodity("10001", "dadawdadawdadad","131313123");
    }
}
