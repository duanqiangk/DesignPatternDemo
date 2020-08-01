package design.facade;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description 公司B 推荐系统
 */
public class RecommentManagement {
    /**
     * 获取用户购买记录
     *
     * @param userId 用户Id
     * @return 购买记录表
     */
    public List<String> listRecord(String userId){
        return Lists.newArrayList("哑铃","发带","手套");
    }
}
