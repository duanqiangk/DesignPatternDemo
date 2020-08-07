package design.prototype;


/**
 * @Description
 */
public class PropertyFactory {
    private static final Property property = new Property("english","hello");
    public static Property getInstance(){
        return property.clone();
    }
}
