package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPhoneStockObservable implements StockObservable {

    List<NotificationObserver> notificationObservers = new ArrayList<>();
    int stalkCount=0;

    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObservers.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObservers.remove(notificationObserver);
    }

    @Override
    public void notifyAllCustomer() {
        for (NotificationObserver notificationObserver: notificationObservers){
            notificationObserver.update();
        }
    }

    @Override
    public void setStalkCount(int count) {
        if (stalkCount == 0){
            notifyAllCustomer();
        }
        stalkCount = stalkCount+count;
    }
}
