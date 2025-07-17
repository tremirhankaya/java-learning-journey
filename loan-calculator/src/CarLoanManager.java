public class CarLoanManager extends BaseLoanManager {
    private double insuranceFee;

    public CarLoanManager() {
    }

    public CarLoanManager(double principal, double rate, int termMonths, double insuranceFee) {
        super(principal, rate, termMonths);
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
}
