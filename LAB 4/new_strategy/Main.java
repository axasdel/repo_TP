package new_strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CardPayment());
        cart.checkout(1500);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(3000);
    }
}