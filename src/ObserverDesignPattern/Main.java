package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IPhoneStockObservable;
import ObserverDesignPattern.Observer.EmailObserver;
import ObserverDesignPattern.Observer.MobileObserver;
import ObserverDesignPattern.Observer.NotificationObserver;

public class Main {

    public static void main(String[] args){
        IPhoneStockObservable iPhoneStockObservable = new IPhoneStockObservable();

        NotificationObserver notificationObserver1 = new EmailObserver("emailId1@Gmail.com", iPhoneStockObservable);
        NotificationObserver notificationObserver2 = new EmailObserver("emailId2@Gmail.com", iPhoneStockObservable);
        NotificationObserver notificationObserver3 = new MobileObserver("userName", iPhoneStockObservable);

        iPhoneStockObservable.add(notificationObserver1);
        iPhoneStockObservable.add(notificationObserver2);
        iPhoneStockObservable.add(notificationObserver3);

        iPhoneStockObservable.setStalkCount(10);
        iPhoneStockObservable.setStalkCount(100);
    }
}
