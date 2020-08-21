package design.responsibility;

/**
 * @Description 领导具体角色 CEO
 */
public class CEO implements Leader {
    @Override
    public boolean accept(int days) {
        return true;
    }

    @Override
    public String getCharacter() {
        return "CEO";
    }
}
