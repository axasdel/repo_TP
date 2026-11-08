package new_strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("оплата " + amount + " руб банковской картой");
    }
}