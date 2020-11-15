package FamilyTree;

import java.util.*;

public class Frontend {
    public static List<Human> family = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "0";
        Human root = new Human();
        for (int i = 0, id = 1; !input.equals("v"); i++) {
            if (i == 0) {
                System.out.print("Adja meg a Családfa gyökerét! ");
                input = s.next();
                root.setName(input);
                root.setId(id);
                id++;
                family.add(root);
            } else {
                System.out.print("Kinek az apját és anyját adja meg? ");
                int idNr = Integer.parseInt(s.next());
                System.out.print("Adja meg " + family.get(idNr - 1).getName() + " apját! ");
                String idNrsFather = s.next();
                Father father = new Father();
                father.setName(idNrsFather);
                father.setId(id);
                family.add(father);
                family.get(idNr - 1).setFather(father);
                family.get(idNr - 1).setHasFather(true);
                System.out.println(father.getName() + "-t létrehoztam " + father.getId() + "-es azonosítóval. ");
                id++;
                System.out.print("Adja meg " + family.get(idNr - 1).getName() + " anyját! ");
                String idNrsMother = s.next();
                Mother mother = new Mother();
                mother.setName(idNrsMother);
                mother.setId(id);
                family.add(mother);
                family.get(idNr - 1).setMother(mother);
                family.get(idNr - 1).setHasMother(true);
                System.out.println(mother.getName() + "-t létrehoztam " + mother.getId() + "-es azonosítóval. ");
                id++;
                System.out.println("Folytassuk? Ha vége, írjon 'v'-t, egyébként bármi mást!");
                input = s.next();
            }
        }
        System.out.println(family.toString());
        printFamilyTree(root.getId(), 0);
    }

    public static void printFamilyTree(int familyMemberId, int nrOfIterations) {
        for (int i = 0; i < nrOfIterations; i++) {
            System.out.print("\t" + "\t");
        }
        System.out.print(family.get(familyMemberId - 1) + "\n");
        if (familyMemberId <= family.get(family.size() - 1).getId()) {
            if (family.get(familyMemberId - 1).isHasMother()) {
                printFamilyTree(family.get(familyMemberId - 1).getMother().getId(), nrOfIterations + 1);
            }
            if (family.get(familyMemberId - 1).isHasFather()) {
                printFamilyTree(family.get(familyMemberId - 1).getFather().getId(), nrOfIterations + 1);
            }
        }
    }
}
