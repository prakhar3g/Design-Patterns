package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailObserver implements NotificationObserver {

    String emailId;
    StockObservable stockObservable;

    public EmailObserver(String emailId, StockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMain(emailId);
    }

    private void sendMain(String emailId) {
        System.out.println("EMail has been send to emailId: " + emailId);
    }
}
