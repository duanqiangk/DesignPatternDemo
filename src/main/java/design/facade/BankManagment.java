package design.facade;

/**
 * @Description 公司B 银行对接系统
 */
public class BankManagment {
    /**
     * 获取用户信用状况
     *
     * @param userId 用户ID
     * @return 信用状况
     */
    public String getCredit(String userId){
        return getUserCreditFromBank(userId);
    }

    /**
     * 从银行获取用户的信用状况
     *
     * @param userId 用户Id
     * @return 信用状况
     */
    private String getUserCreditFromBank(String userId){
        return "良好";
    }
}
