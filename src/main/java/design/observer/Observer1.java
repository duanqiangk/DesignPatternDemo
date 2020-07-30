package design.observer;

/**
 * @Description 观察者1
 */
public class Observer1 implements ObserverService {
    @Override
    public void response() {
        System.out.println("Observer1 response");
    }
}
