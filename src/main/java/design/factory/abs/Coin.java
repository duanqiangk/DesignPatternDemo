package design.factory.abs;

/**
 * @Description 硬币通用接口
 */
public interface Coin {
    /**
     * 获取硬币类型
     * @return 硬币类型
     */
    String getType();

    /**
     * 获取硬币面值
     * @return 硬币面值
     */
    int getValue();
}
