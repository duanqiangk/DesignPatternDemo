package design.strategy;

/**
 * @Description 轮船出行策略类
 */
public class ShipTravelMethod implements TravelMethod {
    @Override
    public void travel() {
        System.out.println("travel by ship");
    }
}
