package design.memento;

/**
 * @Description 发起人角色
 */
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建带有当前状态的备忘录
     *
     * @return 携带当前state的备忘录Memento
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 设置当前状态值为备忘录中的状态值
     *
     * @param memento 携带state的备忘录
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
