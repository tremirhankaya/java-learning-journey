public class CarLoanManager extends BaseLoanManager {
    private double insuranceFee;

    public CarLoanManager() {
    }


    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
}
