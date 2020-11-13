package Bicycle;

import java.util.Scanner;

public class Bicycling {
    private static int[] tomb = {16, 22, 24, 26, 28, 30};
    private static Bicycle bicycle1 = new Bicycle(26, 32, tomb);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fordulatszam = -1;
        double speed = -1;
        String answerFinal = "0";
        for (int i = 0; i < 1; ) {
            System.out.print("Mit adsz meg, sebességet (s) vagy fordulatszámot (f)? ");
            String answer = sc.next();
            answerFinal = answer;
            if (answer.equals("s") || answer.equals("f")) {
                if (answer.equals("s")) {
                    System.out.print("Kérem a sebességet: ");
                    speed = sc.nextDouble();
                    i++;
                }
                if (answer.equals("f")) {
                    System.out.print("Kérem a fordulatszámot: ");
                    fordulatszam = sc.nextDouble();
                    i++;
                }
            } else {
                System.out.println("Hmm... 'f' vagy 's' betűt írjál!");
            }
        }
        System.out.print("Kérem a fokozatot is: ");
        int fokozat = sc.nextInt();
        if (answerFinal.equals("f")){
            System.out.println("A sebességed: " + bicycle1.getSpeed(fordulatszam, fokozat) + " km/h.");
        } else {
            System.out.println("Ehhez a sebességhez a szükséges fordulatszám: " + bicycle1.getFordulatPerSec(speed,
                    fokozat) + "/másodperc.");
        }
    }
}
