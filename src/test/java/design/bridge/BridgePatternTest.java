package design.bridge;

import org.junit.Test;

/**
 * @Description 桥接模式示例
 */
public class BridgePatternTest {

    @Test
    public void test(){
        JuiceMaterial appleMaterial = new AppleMaterial();
        JuiceMaterial orangeMaterial = new OrangeMaterial();

        Machine appleJuiceExtractor = new JuiceExtractor(appleMaterial);
        appleJuiceExtractor.work();

        Machine orangeJuiceExtractor = new JuiceExtractor(orangeMaterial);
        orangeJuiceExtractor.work();
    }
}
