package IntelligentLifeforms;

public class LazyTherapist implements IntelligentLifeform {
    @Override
    public void answer(String text) {
        double nr = Math.random();
        if (text.endsWith("?")) {
            if (nr < 0.25) {
                System.out.println("Biztos ön ebben?");
            } else if (nr < 0.5) {
                System.out.println("Miért gondolja ezt?");
            } else if (nr < 0.75) {
                System.out.println("El tudja képzelni ennek az ellenkezőjét is?");
            } else {
                System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");
            }
        } else if (text.endsWith("!")) {
            if (nr < 0.33) {
                System.out.println("Most dühös lett?");
            } else if (nr < 0.66) {
                System.out.println("Mit érez miközben ezt mondja?");
            } else {
                System.out.println("Feszült lett attól, amiről beszélünk?");
            }
        } else {
            if (nr < 0.25) {
                System.out.println("Kérem, folytassa!");
            } else if (nr < 0.5) {
                System.out.println("Biztos ebben?");
            } else if (nr < 0.75) {
                System.out.println("Csakugyan?");
            } else {
                System.out.println("Hmm. Ez érdekes. Kérem fejtse ki bővebben!");
            }
        }
    }
}
