package new_strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("оплата " + amount + " руб криптовалютой");
    }
}