package design.factory;

import design.factory.method.AbstractMoneyFactory;
import design.factory.method.DollarFactory;
import design.factory.method.Money;
import design.factory.method.RMBFactory;
import org.junit.Test;

/**
 * @Description 工厂方法模式测试类
 */
public class FactoryApproachTest {

    @Test
    public void test(){
        AbstractMoneyFactory rmbFactory = new RMBFactory();
        AbstractMoneyFactory dollarFactory = new DollarFactory();

        Money rmb = rmbFactory.makingMoney(100);
        Money dollar = dollarFactory.makingMoney(50);

        System.out.println("type:"+rmb.getMoneyType()+" value:"+rmb.getMoneyValue());
        System.out.println("type:" + dollar.getMoneyType() + " value:" + dollar.getMoneyValue());
    }
}
