package design.instruct;

import java.util.List;

/**
 * @Description 厨师，相当于接受者
 */
public class Chef {
    public void cooking(int tableNum , List<String> orderList){
        System.out.println(String.format("桌号:%s 正在准备，菜单列表：%s",tableNum,orderList));
    }
}
