import Observable.IphoneStockObservable;
import Observable.ObservableInterface;
import Observer.EmailObserver;
import Observer.ObserverInterface;

public class Main {
    public static void main(String[] args) {
        ObservableInterface iphoneStockObservable = new IphoneStockObservable(0);
        ObserverInterface observer1= new EmailObserver("contactbhagatsachin@gmail.com", iphoneStockObservable);
        ObserverInterface observer2= new EmailObserver("contactbhagatritwik@gmail.com", iphoneStockObservable);
        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.setStockQuantity(15);
    }
}