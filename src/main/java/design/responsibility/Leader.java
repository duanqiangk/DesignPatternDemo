package design.responsibility;

/**
 * @Description 领导抽象接口
 */
public interface Leader {
    /**
     * 员工请假接口
     *
     * @param days 请假天数
     * @return 是否有权准假
     */
    boolean accept(int days);

    /**
     * 获取领导角色
     * @return 角色
     */
    String getCharacter();
}
