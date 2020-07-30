package design.builder;

/**
 * @Description 指挥者，类比于销售店铺
 */
public class AppleStore {
    /**
     * 电脑工厂（具体建造者）
     */
    private AbstractComputerFactory factory ;

    public AppleStore(AbstractComputerFactory factory){
        this.factory = factory;
    }

    /**
     * 组装后销售电脑
     * @return 组装好的电脑（产品角色）
     */
    public Computer sell(){
        factory.buildChassis();
        factory.buildKeyboard();
        factory.buildMonitor();
        return factory.getComputer();
    }
}
