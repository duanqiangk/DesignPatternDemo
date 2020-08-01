package design.bridge;

/**
 * @Description 橘子原材料
 */
public class OrangeMaterial implements JuiceMaterial {
    @Override
    public String getMaterial() {
        return "orange";
    }
}
