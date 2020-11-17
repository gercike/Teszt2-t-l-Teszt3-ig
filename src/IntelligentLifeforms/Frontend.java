package IntelligentLifeforms;

import java.util.Scanner;

public class Frontend {
    public static void main(String[] args) {
        IntelligentLifeform papagaj = new Parrot();
        IntelligentLifeform lusta = new LazyTherapist();
        IntelligentLifeform buta = new DullTherapist();
        Scanner s = new Scanner(System.in);
        System.out.println("Kivel szeretne beszélgetni? (p) parrot, (l)lazy therapist, (d) dull therapist");
        String sentence = s.nextLine();
        if (sentence.equals("p")) {
            System.out.println("Üdvözli a Parrot!");
            while (!sentence.equals("v")) {
                sentence = s.nextLine();
                if (!sentence.equals("v")) {
                    communicate(papagaj, sentence);
                }
            }
        } else if (sentence.equals("l")) {
            System.out.println("Üdvözli a Lazy Therapist!");
            while (!sentence.equals("v")) {
                sentence = s.nextLine();
                if (!sentence.equals("v")) {
                    communicate(lusta, sentence);
                }
            }
        } else if (sentence.equals("d")) {
            System.out.println("Üdvözli a Dull Therapist!");
            while (!sentence.equals("v")) {
                sentence = s.nextLine();
                if (!sentence.equals("v")) {
                    communicate(buta, sentence);
                }
            }
        }
    }

    static void communicate(IntelligentLifeform entity, String text) {
        System.out.print(entity.getClass().getSimpleName() + ": ");
        entity.answer(text);
    }
}
