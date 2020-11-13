package LoanCalculator;

public class LoanCalculator {
    final double nonvipAutoLoanLimit = 500000;
    final double nonvipNoBailerButCoverageLimit = 3000000;
    final double nonvipLoanLimit = 20000000;
    final double vipAutoLoanLimit = 3000000;
    final double vipNoBailerButCoverageLimit = 20000000;
    final double vipLoanLimit = 50000000;

    public double calcInstallments(boolean isVIP, double requestedAmount, int term) {
        double installment = -1;
        if (isVIP) {
            if (requestedAmount <= vipLoanLimit) {
                installment = (requestedAmount + requestedAmount * 0.4 + requestedAmount * 0.02 * (term - 12)) / term;
            } else {
                return -2;
            }
        }
        if (!isVIP) {
            if (requestedAmount <= nonvipLoanLimit) {
                installment = (requestedAmount + requestedAmount * 0.5 + requestedAmount * 0.03 * (term - 12)) / term;
            } else {
                return -3;
            }
        }
        return installment;
    }

    public double countAmountOfCoverage(double installment, boolean isVip, int term) {
        if (isVip) {
            return installment * 0.7 * term;
        } else {
            return installment * 0.8 * term;
        }
    }

    public double getVipLoanLimit() {
        return vipLoanLimit;
    }

    public double getNonvipLoanLimit() {
        return nonvipLoanLimit;
    }
}