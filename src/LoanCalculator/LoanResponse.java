package LoanCalculator;

public class LoanResponse {
    private double givenInstallments;
    private double amountOfCoverage;
    private int minTerm = 12;
    private int maxTerm = 60;

    public String response(LoanRequest request) {
        String answer;
        LoanCalculator calculator = new LoanCalculator();
        if (request.getRequestedProduct().equals("k")) {
            calculator = new LoanCalculator();
        } else if (request.getRequestedProduct().equals("r")) {
            calculator = new NewLoanCalculator();
        }
        setGivenInstallments(calculator.returnInstallments(request.isVIP(), request.getAmount(), request.getTerm()));
        amountOfCoverage = calculator.countAmountOfCoverage(getGivenInstallments(), request.isVIP(), request.getTerm());
        if (request.getTerm() < minTerm || request.getTerm() > maxTerm) {
            answer = "Csak 12 és 60 hónap közötti futamidőre adunk kölcsönt.";
        } else {
            if (getGivenInstallments() == -2) {
                answer = "A VIP ügyfelek által igényelhető kölcsön felső határa: " + calculator.getVipLoanLimit() + "-Ft.";
            } else if (getGivenInstallments() == -3) {
                answer = "A nem VIP ügyfelek által igényelhető kölcsön felső határa: " + calculator.getNonvipLoanLimit() + "-Ft.";
            } else {
                answer = "A havi törlesztőrészlete: " + getGivenInstallments() + "-Ft lesz." + loanAmmount(request.getRequestedProduct(), getGivenInstallments(),
                        request.getTerm());
                if (request.isVIP()) {
                    if (request.getAmount() > calculator.vipAutoLoanLimit) {
                        answer += needCoverage(amountOfCoverage);
                        if (request.getAmount() > calculator.vipNoBailerButCoverageLimit) {
                            answer += needBailer();
                        }
                    }
                } else if (!request.isVIP()) {
                    if (request.getAmount() > calculator.nonvipAutoLoanLimit) {
                        answer += needCoverage(amountOfCoverage);
                        if (request.getAmount() > calculator.nonvipNoBailerButCoverageLimit) {
                            answer += needBailer();
                        }
                    }
                }
            }
        }
        return answer;
    }

    public String needBailer() {
        return "\nAz Ön által igényelt kölcsön folyósításához kezes is szükséges.";
    }

    public String needCoverage(double amountOfCoverage) {
        return "\nAz Ön által igényelt kölcsön folyósításához fedezet is szükséges, amelynek mértéke: " + amountOfCoverage + "-Ft.";
    }

    public String loanAmmount(String product, double installments, int term) {
        String answer = null;
        if (product.equals("k")) {
            answer = "\nÖn által visszafizetendő összesen: " + installments * term + "-Ft.";
        } else if (product.equals("r")) {
            if (installments > 15000) {
                answer = "\nÖn által visszafizetendő összesen: " + installments * (term - 6) + "-Ft.";
            } else {
                answer = "\nÖn által visszafizetendő összesen: " + installments * (term - 3) + "-Ft.";
            }
        }
        return answer;
    }

    public double getGivenInstallments() {
        return givenInstallments;
    }

    public void setGivenInstallments(double givenInstallments) {
        this.givenInstallments = givenInstallments;
    }
}
