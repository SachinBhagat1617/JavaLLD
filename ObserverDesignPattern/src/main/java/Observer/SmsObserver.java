package Observer;

import Observable.ObservableInterface;

public class SmsObserver implements ObserverInterface{
    private final Long phoneNumber;
    private final ObservableInterface observable; // has-a relationship with ObservableInterface
    public SmsObserver(Long phoneNumber, ObservableInterface observable) {
        this.phoneNumber = phoneNumber;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Sending SMS notification to " + phoneNumber + ": Stock is back. Quantity = " + observable.getStockQuantity());
    }
}
