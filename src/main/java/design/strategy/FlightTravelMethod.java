package design.strategy;

/**
 * @Description 飞机出行策略类
 */
public class FlightTravelMethod implements TravelMethod {
    @Override
    public void travel() {
        System.out.println("travel by airplane");
    }
}
