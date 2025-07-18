public class PriceManager {
    BaseCustomer baseCustomer;

    public void calculatePrice(double price) {
        System.out.println(baseCustomer.getPrice(price));
    }
}
