package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationObserver;

public interface StockObservable {

    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifyAllCustomer();
    void setStalkCount(int data);

}
