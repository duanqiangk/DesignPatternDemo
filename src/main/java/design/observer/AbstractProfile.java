package design.observer;

import java.util.List;

/**
 * @Description 抽象主题角色
 */
public interface AbstractProfile {

    /**
     * 添加观察者
     */
    void addObserver(List<ObserverService> observerList);

    /**
     * 重新加载配置文件
     */
    void reloadProfile();

    /**
     * 通知观察者对象
     */
    void notifyObserver();
}
