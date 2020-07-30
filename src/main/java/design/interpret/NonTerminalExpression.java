package design.interpret;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

/**
 * @Description 非终结符表达式角色
 */
public class NonTerminalExpression implements Expression {

    /**
     * 初始化内置数据
     */
    private Set<String> hashSet = Sets.newHashSet();

    public NonTerminalExpression(List<String> dataList){
        hashSet.addAll(dataList);
    }

    @Override
    public boolean interpret(String message) {
        return hashSet.contains(message);
    }
}
