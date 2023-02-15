package common02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author shanzhu
 * @description
 * @create 2023/2/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AwardRes {
    private String code;
    private String message;
}
