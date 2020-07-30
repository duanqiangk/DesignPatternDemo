package design.factory.simple;

/**
 * @Description 美元产品类
 */
public class DollarMoney implements Money {

    /**
     * 美元面值
     */
    private int value;

    public DollarMoney(int value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "dollar";
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
