package design.factory.abs;

/**
 * @Description 具体钱币类，人民币
 */
public class RMBMoney implements Money {
    private int value ;

    public RMBMoney(int value){
        this.value = value;
    }

    @Override
    public String getMoneyType() {
        return "RMB";
    }

    @Override
    public int getMoneyValue() {
        return this.value;
    }
}
