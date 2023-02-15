package common02;

import lombok.Data;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
@Data
public class AwardReq {
    private Integer awardType;
    private String uid;
    private String couponNumber;
    private String uuid;
}
