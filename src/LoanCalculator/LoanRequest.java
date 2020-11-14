package LoanCalculator;

public class LoanRequest {
    private String requestedProduct;
    private boolean isVIP;
    private int term;
    private double amount;

    public LoanRequest(String requestedProduct, boolean isVIP, int term, double amount) {
        this.requestedProduct = requestedProduct;
        this.isVIP = isVIP;
        this.term = term;
        this.amount = amount;
    }

    public String getRequestedProduct() {
        return requestedProduct;
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
