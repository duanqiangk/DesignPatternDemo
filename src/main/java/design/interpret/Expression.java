package design.interpret;

/**
 * @Description 抽象表达式角色
 */
public interface Expression {
    /**
     * 对 指令message 进行解释处理
     * @param message 指令
     * @return 指令处理结果
     */
    boolean interpret(String message);
}
