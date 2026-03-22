package adapter.stripe;

public class StripePaymentService {

    public void makeTransaction(double totalAmount) {
        System.out.println("Stripe transaction: $" + totalAmount);
    }
}
