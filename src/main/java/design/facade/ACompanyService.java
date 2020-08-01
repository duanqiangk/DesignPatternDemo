package design.facade;

/**
 * @Description 对A公司暴露的服务
 */
public interface ACompanyService {
    /**
     * 获取用户信息
     *
     * @param userId 用户Id
     * @return 用户信息
     */
    UserInfo getUserInfo(String userId);
}
