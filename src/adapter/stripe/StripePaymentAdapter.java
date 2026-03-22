package adapter.stripe;

import adapter.interfaces.IPaymentProcessor;

public class StripePaymentAdapter implements IPaymentProcessor {

    private StripePaymentService stripe;

    public StripePaymentAdapter(StripePaymentService stripe) {
        this.stripe = stripe;
    }

    public void processPayment(double amount) {
        stripe.makeTransaction(amount);
    }
}
