package LoanCalculator;

public class LoanResponse {
    private double givenInstallments;
    private double amountOfCoverage;
    private int minTerm = 12;
    private int maxTerm = 60;

    public String response(LoanRequest request) {
        String answer;
        LoanCalculator calculator = new LoanCalculator();
        setGivenInstallments(calculator.calcInstallments(request.isVIP(), request.getAmount(), request.getTerm()));
        amountOfCoverage = calculator.countAmountOfCoverage(getGivenInstallments(), request.isVIP(), request.getTerm());
        if (request.getTerm() < minTerm || request.getTerm() > maxTerm) {
            answer = "Csak 12 és 60 hónap közötti futamidőre adunk kölcsönt.";
        } else {
            if (getGivenInstallments() == -2) {
                answer = "A VIP ügyfelek által igényelhető kölcsön felső határa: " + calculator.getVipLoanLimit() + ",-Ft.";
            } else if (getGivenInstallments() == -3) {
                answer = "A nem VIP ügyfelek által igényelhető kölcsön felső határa: " + calculator.getNonvipLoanLimit() + ",-Ft.";
            } else {
                answer = "A havi törlesztőrészlete: " + getGivenInstallments() + ",-Ft lesz.";
                if (request.isVIP()) {
                    if (request.getAmount() > calculator.vipAutoLoanLimit) {
                        answer +=
                                "\nAz Ön által igényelt kölcsön folyósításához fedezet is szükséges, amelynek mértéke: " + amountOfCoverage +
                                        ",-Ft.\nAz Ön által fizetendő összeg összesen: " + getGivenInstallments() * request.getTerm() + ",-Ft.";
                        if (request.getAmount() > calculator.vipNoBailerButCoverageLimit) {
                            answer += "\nAz Ön által igényelt kölcsön folyósításához kezes is szükséges.";
                        }
                    }
                } else if (!request.isVIP()) {
                    if (request.getAmount() > calculator.nonvipAutoLoanLimit) {
                        answer +=
                                "\nAz Ön által igényelt kölcsön folyósításához fedezet is szükséges, amelynek mértéke: " + amountOfCoverage +
                                        ",-Ft.\nAz Ön által fizetendő összeg összesen: " + getGivenInstallments() * request.getTerm() + ",-Ft.";
                        if (request.getAmount() > calculator.nonvipNoBailerButCoverageLimit) {
                            answer += "\nAz Ön által igényelt kölcsön folyósításához kezes is szükséges.";
                        }
                    }
                }
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
