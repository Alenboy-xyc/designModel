package common01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponResult {
    private String code;
    private String info;
    private String uuid;
    private String couponNumber;
    private String uid;
}
