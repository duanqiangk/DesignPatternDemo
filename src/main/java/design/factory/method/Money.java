package design.factory.method;

/**
 * @Description 钱币抽象接口，具体钱币对象需实现此接口
 */
public interface Money {
    /**
     * 获取钱币类型
     * @return 钱币类型（RMB or dollar）
     */
    String getMoneyType();

    /**
     * 获取钱币面值
     * @return 钱币面值---正整数
     */
    int getMoneyValue();
}
