package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileObserver implements NotificationObserver {

    String userName;
    StockObservable stockObservable;

    public MobileObserver(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMobileNotification(userName);
    }

    private void sendMobileNotification(String userName) {
        System.out.println("Notification has been sent to: "+userName);
    }
}
