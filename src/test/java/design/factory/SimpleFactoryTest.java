package design.factory;

import design.factory.simple.*;
import org.junit.Test;

/**
 * @Description 简单工厂模式测试
 */
public class SimpleFactoryTest {

    @Test
    public void simpleFactoryTest(){
        Money rmb = MoneyFactory.makingMoney("RMB", 100);
        System.out.println("type:"+rmb.getType()+" value:"+rmb.getValue());

        Money dollar = MoneyFactory.makingMoney("dollar", 50);
        System.out.println("type:" + dollar.getType() + " value:" + dollar.getValue());
    }
}
