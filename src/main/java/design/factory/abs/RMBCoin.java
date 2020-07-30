package design.factory.abs;

/**
 * @Description 人民币硬币具体实现类
 */
public class RMBCoin implements Coin{

    private int value;

    public RMBCoin(int value){
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
