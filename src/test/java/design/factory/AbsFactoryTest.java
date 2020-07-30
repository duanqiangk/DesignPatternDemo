package design.factory;

import design.factory.abs.*;
import org.junit.Test;

/**
 * @Description 抽象工厂模式测试
 */
public class AbsFactoryTest {

    @Test
    public void test(){
        AbstractMoneyFactory rmbFactory = new RMBFactory();
        AbstractMoneyFactory dollarFactory = new DollarFactory();

        Money rmb = rmbFactory.makingMoney(100);
        Coin rmbCoin = rmbFactory.makingCoin(1);
        Money dollar = dollarFactory.makingMoney(50);
        Coin dollarCoin = dollarFactory.makingCoin(2);


        System.out.println("type:"+rmb.getMoneyType()+" value:"+rmb.getMoneyValue());
        System.out.println("type:" + rmbCoin.getType() + " value:" + rmbCoin.getValue());
        System.out.println("type:" + dollar.getMoneyType() + " value:" + dollar.getMoneyValue());
        System.out.println("type:" + dollarCoin.getType() + " value:" + dollarCoin.getValue());

    }
}
