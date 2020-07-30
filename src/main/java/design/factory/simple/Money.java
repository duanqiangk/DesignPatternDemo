package design.factory.simple;

/**
 * @Description 钱币接口，钱币具体类需实现此接口
 */
public interface Money {
    /**
     * 获取钱币类别
     * @return RMB or dollar
     */
    String getType();

    /**
     * 获取面值
     * @return 钱币面值
     */
    int getValue();
}
