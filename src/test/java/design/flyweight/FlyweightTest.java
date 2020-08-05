package design.flyweight;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @Description 享元模式测试
 */
public class FlyweightTest {

    @Test
    public void test() {
        String userId = "qq_303939";
        List<String> nickNameList = Lists.newArrayList("Bob", "Bruce", "Lily", "Tom");
        List<Integer> age = Lists.newArrayList(20, 30);

        RequestInfoFactory requestInfoFactory = new RequestInfoFactory();

        for(int i = 0 ; i < 20 ; ++ i ){
            requestInfoFactory.submit(
                    userId,
                    getRandomElement(nickNameList),
                    getRandomElement(age)
            );
        }
    }

    public <T> T getRandomElement(List<T> list) {
        return list.get(((int)(Math.random() * 100) % list.size()));
    }
}
