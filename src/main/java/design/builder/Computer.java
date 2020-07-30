package design.builder;

/**
 * @Description 产品类，电脑
 */
public class Computer {
    /**
     * 机箱
     */
    private String chassis;
    /**
     * 键盘
     */
    private String keyboard;
    /**
     * 显示器
     */
    private String monitor;

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    /**
     * 开启电脑
     */
    public void open(){
        if (this.chassis != null && keyboard != null && monitor != null){
            System.out.println("电脑已开启");
            return;
        }
        System.out.println("缺少部件，无法开启");
    }
}
