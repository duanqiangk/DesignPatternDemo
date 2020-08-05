package design.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 请求信息实体类
 */
@Data
@AllArgsConstructor
public class RequestInfo {
    private String userId;
    private String nickName;
    private int age;
}
