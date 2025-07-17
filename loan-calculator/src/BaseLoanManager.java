import java.util.Random;

public class BaseLoanManager {
    private double principal;
    private double rate;
    private int termMonths;

    public BaseLoanManager(double principal, double rate, int termMonths) {
        this.principal = principal;
        this.rate = rate;
        this.termMonths = termMonths;
    }

    public double getPrincipal() {
        return principal;
    }

    public BaseLoanManager() {
    }

    public double getPrincipal(double principal) {
        return principal;
    }

    public void setPrincipal(double principalAmount) {
        this.principal = principalAmount;
    }

    public double getRate() {

        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public double calculateMonthlyPayment() {
        return calculateTotalPayment() / termMonths;
    }

    public double calculateTotalPayment() {
        return principal + (principal * rate * termMonths / 12);
    }

    public void showLoanDetails() {
        System.out.println("Principal: " + principal);
        System.out.printf("Rate: %.2f%%\n", rate * 100);
        System.out.println("Term Months: " + termMonths);
        System.out.printf("Total Payment: %.2f\n", calculateTotalPayment());
        System.out.printf("Monthly Payment: %.2f\n", calculateMonthlyPayment());
    }


}
