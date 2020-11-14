package LoanCalculator;

public class NewLoanCalculator extends LoanCalculator {
    private String productName = "Azonnal kápé, fizetni meg ráé’!";

    @Override
    public double calcNonVipInstallment(double requestedAmount, int term) {
        double installment = (requestedAmount + requestedAmount * 0.5 + requestedAmount * 0.03 * (term - 12)) / (term - 3);
        if (installment > 15000) {
            double leftover = installment - 15000;
            double newInstallment = (requestedAmount + requestedAmount * 0.5 + requestedAmount * 0.03 * (term - 12) + 3 * leftover) / (term - 6);
            return newInstallment;
        }
        return installment;
    }

    @Override
    public double calcVipInstallment(double requestedAmount, int term) {
        double installment = (requestedAmount + requestedAmount * 0.4 + requestedAmount * 0.02 * (term - 12)) / (term-3);
        if (installment > 15000) {
            double leftover = installment - 15000;
            double newInstallment = (requestedAmount + requestedAmount * 0.4 + requestedAmount * 0.02 * (term - 12) + 3 * leftover) / (term - 6);
            return newInstallment;
        }
        return installment;
    }
}
