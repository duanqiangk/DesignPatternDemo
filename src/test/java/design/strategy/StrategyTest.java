package design.strategy;

import org.junit.Test;

/**
 * @Description 策略模式测试
 */
public class StrategyTest {

    @Test
    public void travelTest(){
        TravelMethod busTravelMethod = new BusTravelMethod();
        TravelMethod flightTravelMethod = new FlightTravelMethod();
        TravelMethod shipTravelMethod = new ShipTravelMethod();

        Context context = new Context(busTravelMethod);
        context.travel();

        context.setTravelMethod(flightTravelMethod);
        context.travel();

        context.setTravelMethod(shipTravelMethod);
        context.travel();
    }
}
