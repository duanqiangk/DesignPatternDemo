package design.factory.abs;

/**
 * @Description 美元具体实现类
 */
public class DollarMoney implements Money {

    private int value;

    public DollarMoney(int value) {
        this.value = value;
    }

    @Override
    public String getMoneyType() {
        return "dollar";
    }

    @Override
    public int getMoneyValue() {
        return this.value;
    }
}
