package design.factory.method;

/**
 * @Description 美元工厂类
 */
public class DollarFactory implements AbstractMoneyFactory {
    @Override
    public Money makingMoney(int value) {
        return new DollarMoney(value);
    }
}
