package design.strategy;

/**
 * @Description 汽车出行策略类
 */
public class BusTravelMethod implements TravelMethod {
    @Override
    public void travel() {
        System.out.println("travel by bus");
    }
}
