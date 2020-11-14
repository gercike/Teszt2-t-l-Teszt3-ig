package LoanCalculator;

import java.util.Scanner;

public class Frontend {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("A HITELKALKULÁTOR üdvözli Önt!");
        System.out.print("Melyik termékünk iránt érdeklődik, 'Kölcsön, hogy kölcsön' (k) vagy 'Azonnal kápé, fizetni meg ráé!' (r) ? " );
        String product = sc.next();
        System.out.print("Mekkora összeget szeretne felvenni? ");
        double loan = sc.nextInt();
        System.out.print("Mekkora futamidőt szeretne (hány hónap alatt szeretné visszafizetni a kölcsönt) (12-60)? ");
        int term = sc.nextInt();
        System.out.print("Ön VIP ügyfél (true vagy false)? ");
        boolean VIP = sc.nextBoolean();
        LoanRequest request = new LoanRequest(product, VIP, term, loan);
        LoanResponse answer = new LoanResponse();
        System.out.println(answer.response(request));
    }
}
