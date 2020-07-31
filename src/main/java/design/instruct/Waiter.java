package design.instruct;

/**
 * @Description 服务员，调用者
 */
public class Waiter {
    private Menu menu;

    public Waiter(Menu menu){
        this.menu = menu;
    }

    public void setMenu(Menu menu){
        this.menu = menu;
    }

    public void submitList(){
        menu.submit();
    }
}
