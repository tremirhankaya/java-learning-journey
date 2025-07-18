
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.paymentProcess(new CreditCardPayment(), 1000);

    }
}
