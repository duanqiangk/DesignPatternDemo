package design.factory.simple;

/**
 * @Description 人民币产品类
 */
public class RMBMoney implements Money {

    /**
     * 人民币面值
     */
    private int value;

    public RMBMoney(int value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "RMB";
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
