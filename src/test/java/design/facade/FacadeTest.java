package design.facade;

import org.junit.Test;

/**
 * @Description 外观模式测试
 */
public class FacadeTest {

    @Test
    public void test(){
        ACompanyService service = new ACompanyServiceImpl();
        UserInfo userInfo = service.getUserInfo("userid");
        System.out.println(userInfo);
    }
}
