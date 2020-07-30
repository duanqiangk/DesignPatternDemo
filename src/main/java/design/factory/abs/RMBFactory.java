package design.factory.abs;

/**
 * @Description 人民币工厂类
 */
public class RMBFactory implements AbstractMoneyFactory {
    @Override
    public Money makingMoney(int value) {
        return new RMBMoney(value);
    }

    @Override
    public Coin makingCoin(int value) {
        return new RMBCoin(value);
    }
}
