package design.factory.abs;

/**
 * @Description 美元工厂类
 */
public class DollarFactory implements AbstractMoneyFactory {
    @Override
    public Money makingMoney(int value) {
        return new DollarMoney(value);
    }

    @Override
    public Coin makingCoin(int value) {
        return new DollarCoin(value);
    }
}
