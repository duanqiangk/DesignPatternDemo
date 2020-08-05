package design.flyweight;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Description 享元模式工厂
 */
public class RequestInfoFactory {

    private Map<String , RequestInfo> infoMap = Maps.newHashMap();

    public RequestInfo submit(String userId , String nickName , int age){
        String key = String.format("%s-%d" , nickName,age);
        if(infoMap.containsKey(key)){
            System.out.println("该信息已存在");
            return infoMap.get(key);
        }
        System.out.println(String.format("创建请求信息：%s",key));
        infoMap.put(key, new RequestInfo(userId,nickName,age));
        return infoMap.get(key);
    }
}
