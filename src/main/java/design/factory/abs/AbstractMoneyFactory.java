package design.factory.abs;

/**
 * @Description 抽象工厂接口，具体工厂需实现此接口
 */
public interface AbstractMoneyFactory {
    /**
     * 制造钱币方法
     *
     * @param value 钱币面值
     * @return 钱币具体对象
     */
    Money makingMoney(int value);

    /**
     * 生产硬币
     *
     * @param value 硬币面额
     * @return 硬币对象
     */
    Coin makingCoin(int value);
}
