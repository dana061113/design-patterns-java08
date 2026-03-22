package adapter.paypal;

import adapter.interfaces.IPaymentProcessor;

public class PayPalPaymentProcessor implements IPaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("PayPal payment: $" + amount);
    }
}
