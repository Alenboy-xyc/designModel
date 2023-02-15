package common01;

import lombok.Data;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
@Data
public class DeliverReq {
    private String userName;
    private String userPhone;
    private String sku;
    private String orderId;
}
