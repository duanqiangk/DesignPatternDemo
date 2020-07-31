package design.instruct;

import java.util.List;

/**
 * @Description 菜单，相当于具体命令角色
 */
public class Menu implements Instruct{

    private List<String> orderList;
    private int tableNum;
    private Chef chef;

    public Menu(int tableNum ,List<String> orderList){
        this.tableNum = tableNum;
        this.orderList = orderList;
        this.chef = new Chef();
    }

    @Override
    public void submit() {
        this.chef.cooking(this.tableNum,this.orderList);
    }
}
