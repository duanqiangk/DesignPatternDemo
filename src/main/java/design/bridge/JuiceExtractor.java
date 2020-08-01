package design.bridge;

/**
 * @Description 榨汁机
 */
public class JuiceExtractor extends Machine {

    private JuiceMaterial juiceMaterial;

    public JuiceExtractor(JuiceMaterial material){
        this.juiceMaterial = material;
    }

    @Override
    protected void work() {
        System.out.println(
                String.format("The %s juice is being squeezed!" , this.juiceMaterial.getMaterial())
        );
    }
}
