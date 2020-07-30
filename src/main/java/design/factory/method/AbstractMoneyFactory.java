package design.factory.method;

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
}
