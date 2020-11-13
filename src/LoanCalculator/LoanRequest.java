package LoanCalculator;

public class LoanRequest {
    private boolean isVIP;
    private int term;
    private double amount;

    public LoanRequest(boolean isVIP, int term, double amount) {
        this.isVIP = isVIP;
        this.term = term;
        this.amount = amount;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public int getTerm() {
        return term;
    }

    public double getAmount() {
        return amount;
    }
}
