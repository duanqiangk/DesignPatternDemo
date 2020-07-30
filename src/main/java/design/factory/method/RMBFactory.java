package design.factory.method;

/**
 * @Description 人民币工厂类
 */
public class RMBFactory implements AbstractMoneyFactory {
    @Override
    public Money makingMoney(int value) {
        return new RMBMoney(value);
    }
}
