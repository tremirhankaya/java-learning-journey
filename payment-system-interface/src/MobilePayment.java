public class MobilePayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("You paid " + amount + "$ with mobile transfer");
    }
}
