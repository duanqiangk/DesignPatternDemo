package design.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Description 对A公司暴露的用户信息Bean
 */
@Data
@AllArgsConstructor
public class UserInfo {
    private String userInfo;
    private String credit;
    private List<String> recordList;

    @Override
    public String toString(){
        return String.format("userInfo:%s,credit:%s,recordList:%s",
                userInfo,credit,recordList);
    }
}
