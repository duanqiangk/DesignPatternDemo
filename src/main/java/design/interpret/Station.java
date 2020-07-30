package design.interpret;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description 环境角色，示例中指火车站
 */
public class Station {
    private List<String> cityFree = Lists.newArrayList("北京", "天津");
    private List<String> peopleFree = Lists.newArrayList("老人", "小孩");

    private Expression cityPeopleExpression;

    public Station() {
        cityPeopleExpression = new TerminalExpression(
                new NonTerminalExpression(cityFree),
                new NonTerminalExpression(peopleFree)
        );
    }

    /**
     * 检查资格
     *
     * @param cityPeople “地名”的“人群”
     */
    public void check(String cityPeople) {
        if (cityPeopleExpression.interpret(cityPeople)) {
            System.out.println(cityPeople + "可以免费乘车");
            return;
        }
        System.out.println(cityPeople + "需要付费乘车");
    }

    public static void main(String[] args) {
        List<String> testString = Lists.newArrayList(
                "北京的小孩",
                "上海的小孩",
                "天津的年轻人",
                "北京的年轻人",
                "天津的老人",
                "北京的老人"
        );

        Station station = new Station();
        testString.forEach(station::check);
    }

}
