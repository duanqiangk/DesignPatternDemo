package design.responsibility;

/**
 * @Description 领导具体角色 部门领导
 */
public class DepartmentLeader implements Leader {
    @Override
    public boolean accept(int days) {
        return days <= 7;
    }

    @Override
    public String getCharacter() {
        return "Department Leader";
    }
}
