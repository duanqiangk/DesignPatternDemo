package design.instruct;

/**
 * @Description 抽象命令角色
 */
public interface Instruct {
    /**
     * 提交菜单（命令）给厨师（执行者）
     */
    void submit();
}
