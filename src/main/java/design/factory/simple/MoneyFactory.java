package design.factory.simple;

/**
 * @Description 钱币工厂，生产美元/人民币
 */
public class MoneyFactory {
    /**
     * 生产美元/钱币 的工厂方法
     * @param type 钱币类型
     * @param value 钱币面值
     * @return 钱币具体对象
     */
    public static Money makingMoney(String type,int value){
        if(type != null && "RMB".equals(type.trim())){
            return new RMBMoney(value);
        }
        if(type != null && "dollar".equals(type.trim())){
            return new DollarMoney(value);
        }
        return null;
    }
}
