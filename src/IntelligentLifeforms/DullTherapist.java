package IntelligentLifeforms;

public class DullTherapist implements IntelligentLifeform {

    public void answer(String text) {
        double nr = Math.random();
        if (nr < 0.25) {
            System.out.println("Kérem, folytassa!");
        } else if (nr < 0.5) {
            System.out.println("Biztos ebben?");
        } else if (nr < 0.75) {
            System.out.println("Csakugyan?");
        } else {
            System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");
        }
    }

}
