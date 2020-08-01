package design.facade;

/**
 * @Description 公司B 用户管理系统
 */
public class UserManagement {

    /**
     * 获取用户信息
     * @param userId 用户Id
     * @return 经过调用整合后返回 用户信息
     */
    public String getUserInfo(String userId){
        // 简单起见直接返回userId
        return userId;
    }
}
