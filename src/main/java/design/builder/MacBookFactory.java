package design.builder;

/**
 * @Description 具体建造者，实现抽象建造者接口，类比于电脑工厂
 */
public class MacBookFactory extends AbstractComputerFactory {
    @Override
    public void buildChassis() {
        super.computer.setChassis("机箱已装配");
    }

    @Override
    public void buildKeyboard() {
        super.computer.setKeyboard("键盘已装配");
    }

    @Override
    public void buildMonitor() {
        super.computer.setMonitor("显示器已装配");
    }
}
