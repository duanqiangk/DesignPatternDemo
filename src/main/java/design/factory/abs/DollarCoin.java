package design.factory.abs;

/**
 * @Description 美币硬币具体实现类
 */
public class DollarCoin implements Coin{

    private int value;

    public DollarCoin(int value){
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
