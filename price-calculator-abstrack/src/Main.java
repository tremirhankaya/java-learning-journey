
public class Main {
    public static void main(String[] args) {
        PriceManager priceManager = new PriceManager();
        priceManager.baseCustomer = new SeniorCustomer();
        priceManager.calculatePrice(1000);
    }
}