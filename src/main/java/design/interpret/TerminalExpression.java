package design.interpret;

/**
 * @Description 终结符表达式角色
 */
public class TerminalExpression implements Expression {

    /**
     * 城市语言处理器
     */
    private Expression cityExpression;
    /**
     * 人群语言处理器
     */
    private Expression peopleExpression;

    public TerminalExpression(Expression cityExpression, Expression peopleExpression) {
        this.cityExpression = cityExpression;
        this.peopleExpression = peopleExpression;
    }

    @Override
    public boolean interpret(String message) {
        String[] wordArray = message.split("的");
        if (wordArray.length != 2) {
            throw new RuntimeException("语法错误:" + message);
        }

        return cityExpression.interpret(wordArray[0]) && peopleExpression.interpret(wordArray[1]);
    }

}
