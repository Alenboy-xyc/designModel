package common01;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
public class CouponService {
    /**
     * 优惠卷
     * @param uid
     * @param couponNumber
     * @param uuid
     * @return
     */
    public CouponResult sndCoupon(String uid, String couponNumber, String uuid) {
        return new CouponResult("0000","你好",uid, couponNumber, uuid);
    }
}
