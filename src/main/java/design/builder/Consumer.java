package design.builder;

/**
 * @Description 客户类
 */
public class Consumer {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore( new MacBookFactory());
        Computer computer = appleStore.sell();
        computer.open();
    }
}
