package design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 管理者角色
 */
public class Caretaker {

    private List<Memento> mementoList ;

    public Caretaker(){
        this.mementoList = new ArrayList<>();
    }

    /**
     * 新增备忘录
     *
     * @param memento 备忘录
     */
    public void appendMemento(Memento memento){
        this.mementoList.add(memento);
    }

    /**
     * 获取最后添加的备忘录
     *
     * @return 最后添加的备忘录，如果没有返回null
     */
    public Memento lastMemento(){
        if(!this.mementoList.isEmpty()){
            return this.mementoList.get(this.mementoList.size() - 1);
        }
        return null;
    }
}
