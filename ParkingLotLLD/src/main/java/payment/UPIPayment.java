package payment;

public class UPIPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        return true;
    }
}
