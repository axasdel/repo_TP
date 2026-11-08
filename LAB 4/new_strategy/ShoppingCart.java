package new_strategy;

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int totalAmount) {
        if (strategy == null) {
            System.out.println("выберите способ оплаты");
            return;
        }
        strategy.pay(totalAmount);
    }
}