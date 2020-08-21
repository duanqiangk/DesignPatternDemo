package design.responsibility;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @Description 职责链模式测试
 */
public class ChainOfResponsibilityTest {

    @Test
    public void test(){
        List<Leader> leaderChain = Lists.newArrayList();
        leaderChain.add(new DirectLeader());
        leaderChain.add(new DepartmentLeader());
        leaderChain.add(new CEO());

        int n = 4;
        for (Leader leader : leaderChain){
            if(leader.accept(n)){
                System.out.println(leader.getCharacter() + " accept");
                break;
            }
        }
    }
}
