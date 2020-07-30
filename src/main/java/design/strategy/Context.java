package design.strategy;

/**
 * @Description 环境类，有权限执行策略
 */
public class Context {
    private TravelMethod travelMethod;

    public Context(TravelMethod travelMethod){
        this.travelMethod = travelMethod;
    }

    /**
     * 设置策略（出行方式）
     * @param travelMethod  出行方式策略类
     */
    public void setTravelMethod(TravelMethod travelMethod) {
        this.travelMethod = travelMethod;
    }

    /**
     * 执行策略
     */
    public void travel(){
        this.travelMethod.travel();
    }
}
