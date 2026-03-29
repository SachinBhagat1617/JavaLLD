package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface {
    String getStockQuantity();
    void addObserver(ObserverInterface observer);
    void removeObserver(ObserverInterface observer);
    void notifyObservers();
    void setStockQuantity(int stockQuantity);
}
