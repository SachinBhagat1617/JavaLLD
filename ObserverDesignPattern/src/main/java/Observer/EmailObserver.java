package Observer;

import Observable.ObservableInterface;

public class EmailObserver implements ObserverInterface{
    private final String emailId;
    private final ObservableInterface observable; // has-a relationship with ObservableInterface
    public EmailObserver(String emailId, ObservableInterface observable) {
        // Constructor logic if needed
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Sending email notification to  "+ emailId + ": Stock is back. Quantity ="  + observable.getStockQuantity());
    }
}
