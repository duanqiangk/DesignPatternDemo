package design.instruct;

import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * @Description 顾客点餐测试
 */
public class Customer {

    @Test
    public void customerTest(){
        Menu menu1 = new Menu(1, Lists.newArrayList("鱼","骨头","面包"));
        Menu menu2 = new Menu(2, Lists.newArrayList("沙拉","肉汤","面条"));

        Waiter waiter = new Waiter(menu1);
        waiter.submitList();
        waiter.setMenu(menu2);
        waiter.submitList();
    }
}
