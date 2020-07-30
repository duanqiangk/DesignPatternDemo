package design.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Description 具体主题角色
 */
public class ProjectProfile implements AbstractProfile {

    /**
     * 观察者列表
     */
    private List<ObserverService> observerServiceList = Lists.newArrayList();

    @Override
    public void addObserver(List<ObserverService> observerList) {
        if(observerList != null){
            this.observerServiceList.addAll(observerList);
        }
    }

    @Override
    public void reloadProfile() {
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        this.observerServiceList.forEach(ObserverService::response);
    }
}
