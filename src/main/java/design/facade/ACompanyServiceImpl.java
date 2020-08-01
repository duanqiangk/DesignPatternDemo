package design.facade;

import java.util.List;

/**
 * @Description A公司服务实体类
 */
public class ACompanyServiceImpl implements ACompanyService {

    private BankManagment bankManagment = new BankManagment();
    private RecommentManagement recommentManagement = new RecommentManagement();
    private UserManagement userManagement = new UserManagement();


    @Override
    public UserInfo getUserInfo(String userId) {
        String credit = bankManagment.getCredit(userId);
        List<String> recordList = recommentManagement.listRecord(userId);
        String userInfo = userManagement.getUserInfo(userId);

        return new UserInfo(userInfo, credit, recordList);
    }
}
