package design.bridge;

/**
 * @Description 苹果原材料
 */
public class AppleMaterial implements JuiceMaterial {
    @Override
    public String getMaterial() {
        return "apple";
    }
}
