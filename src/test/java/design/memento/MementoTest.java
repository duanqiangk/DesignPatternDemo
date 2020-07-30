package design.memento;

import org.junit.Test;


/**
 * @Description 备忘录模式测试
 */
public class MementoTest {

    @Test
    public void mementoTest() {
        // 创建管理者
        Caretaker caretaker = new Caretaker();
        // 创建发起人,并初始化发起人状态
        Originator originator = new Originator("state 1");

        // 当前状态记录并打印
        caretaker.appendMemento(originator.createMemento());
        prtCurrentState(originator);

        // 当前状态记录并打印
        originator.setState("state 2");
        caretaker.appendMemento(originator.createMemento());
        prtCurrentState(originator);

        // 设置最终状态为“state 3”，不保存当前状态副本
        originator.setState("state 3");
        prtCurrentState(originator);

        // “退档状态”一次，并打印当前状态
        originator.restoreMemento(caretaker.lastMemento());
        prtCurrentState(originator);
    }

    public void prtCurrentState(Originator originator) {
        System.out.println("Current state：" + originator.getState());
    }
}
