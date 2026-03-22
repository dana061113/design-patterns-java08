package adapter;

import adapter.interfaces.IPaymentProcessor;
import adapter.paypal.PayPalPaymentProcessor;
import adapter.stripe.*;

public class Main {
    public static void main(String[] args) {

        IPaymentProcessor paypal = new PayPalPaymentProcessor();
        paypal.processPayment(100);

        IPaymentProcessor stripe =
                new StripePaymentAdapter(new StripePaymentService());
        stripe.processPayment(200);
    }
}
