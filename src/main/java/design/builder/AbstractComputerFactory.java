package design.builder;

/**
 * @Description 抽象建造者，规定产品各个子部件创建的抽象方法
 */
public abstract class AbstractComputerFactory {
    protected Computer computer = new Computer();

    /**
     * 造机箱
     */
    public abstract void buildChassis();

    /**
     * 造键盘
     */
    public abstract void buildKeyboard();

    /**
     * 造显示器
     */
    public abstract void buildMonitor();

    /**
     * 生产出厂
     * @return 电脑产品
     */
    public Computer getComputer(){
        return this.computer;
    }
}
