package design.responsibility;

/**
 * @Description 领导具体角色 直属领导
 */
public class DirectLeader implements Leader {
    @Override
    public boolean accept(int days) {
        return days <= 3;
    }

    @Override
    public String getCharacter() {
        return "Direct Leader";
    }
}
