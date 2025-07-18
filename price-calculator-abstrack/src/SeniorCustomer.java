public class SeniorCustomer extends BaseCustomer {
    @Override
    public double getPrice(double price) {
        return price * 0.85;
    }
}
