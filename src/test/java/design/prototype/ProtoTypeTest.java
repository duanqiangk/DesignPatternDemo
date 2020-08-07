package design.prototype;

import org.junit.Test;

/**
 * @Description
 */
public class ProtoTypeTest {

    @Test
    public void test(){
        Property property1 = PropertyFactory.getInstance();
        Property property2 = PropertyFactory.getInstance();

        System.out.println(property1);
        System.out.println(property2);
        System.out.println("property1 == property2 ?" + (property1 == property2));
    }
}
