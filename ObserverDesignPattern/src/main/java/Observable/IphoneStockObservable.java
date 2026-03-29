package Observable;

import Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements ObservableInterface {
    List<ObserverInterface> observerList=new ArrayList<>();
    private int stockQuantity;
     public IphoneStockObservable( int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    @Override
    public String getStockQuantity() {
        return String.valueOf(stockQuantity);
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface observer : observerList) {
            observer.update();
        }
    }
    @Override
    public void setStockQuantity(int stockQuantity) {

        if(this.stockQuantity == 0) {
            this.stockQuantity = stockQuantity;
            notifyObservers();
            return;
        }
        this.stockQuantity = stockQuantity;

    }
}
