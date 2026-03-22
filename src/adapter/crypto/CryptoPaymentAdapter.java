package adapter.crypto;

import adapter.interfaces.IPaymentProcessor;

public class CryptoPaymentAdapter implements IPaymentProcessor {

    private CryptoPaymentService cryptoService;

    public CryptoPaymentAdapter(CryptoPaymentService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @Override
    public void processPayment(double amount) {
        cryptoService.sendCrypto(amount);
    }
}
