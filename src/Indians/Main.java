package Indians;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    private static String filePath = "src/Indians/indianok.txt";

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Indian> indians = (dataIntoArrayList(filePath));
//        System.out.println(dataIntoArrayList(filePath).size()); //1. feladat
//        System.out.println(indianEquipments(indians).toString()); //2. feladat
//        System.out.println(countMembersOfTribe(indians, "Iroquois")); //3. feladat
//        int[] menAndWomen = countMenAndWomenOfTribe(indians, "Sioux");                          //4. feladat
//        System.out.println("férfiak száma: " + menAndWomen[0] + ", nők száma: " + menAndWomen[1]);   //4. feladat
//        System.out.println(getEldersOfTribe(indians, "Apache").toString()); //5. feladat
//        System.out.println(countAverageNumOfBelongings(indians)); //6. feladat
//        System.out.println(countIndiansWithBow(indians)); //7. feladat
//        System.out.println(countBarefeetAndTheirAverageAge(indians).toString()); //8. feladat
//        HashMap<String, ArrayList<Indian>> redskins = putIndiansIntoHashmapByTribe(indians);
//        System.out.println(getMostPopulatedTribe(redskins));
    }

    public static String getMostPopulatedTribe(HashMap<String, ArrayList<Indian>> indians) {
        Iterator<String> iterator = indians.keySet().iterator();
        String mostPopulatedTribe = "";
        int number = 0;
        while (iterator.hasNext()) {
            String lala = iterator.next();
            if (indians.get(lala).size() > number) {
                number = indians.get(lala).size();
                mostPopulatedTribe = lala;
            }
        }
        return mostPopulatedTribe;
    }

    public static HashMap<String, ArrayList<Indian>> putIndiansIntoHashmapByTribe(ArrayList<Indian> indians) {
        HashMap<String, ArrayList<Indian>> redskins = new HashMap<>();
        for (Indian indian : indians) {
            redskins.putIfAbsent(indian.getTribe(), new ArrayList<>());
            redskins.get(indian.getTribe()).add(indian);
        }
        return redskins;
    }

    public static ArrayList<Integer> countBarefeetAndTheirAverageAge(ArrayList<Indian> indians) {
        ArrayList answer = new ArrayList();
        int counter = 0;
        int ageSum = 0;
        for (Indian indian : indians) {
            if (!indian.getEquipment().contains("mokaszin")) {
                counter++;
                ageSum += indian.getAge();
            }
        }
        answer.add(counter);
        answer.add(((float) ageSum) / counter);
        return answer;
    }

    public static int countIndiansWithBow(ArrayList<Indian> indians) {
        int counter = 0;
        for (Indian indian : indians) {
            if (indian.getEquipment().contains("íj")) {
                counter++;
            }
        }
        return counter;
    }

    public static float countAverageNumOfBelongings(ArrayList<Indian> indians) {
        int counter = 0;
        for (Indian indian : indians) {
            for (String equipment : indian.getEquipment()) {
                counter++;
            }
        }
        return ((float) counter) / indians.size();
    }

    public static ArrayList<Indian> getEldersOfTribe(ArrayList<Indian> indians, String tribe) {
        ArrayList<Indian> elders = new ArrayList<>();
        for (Indian indian : indians) {
            if (indian.getTribe().equals(tribe) && indian.getEquipment().contains("békepipa")) {
                elders.add(indian);
            }
        }
        return elders;
    }

    public static int[] countMenAndWomenOfTribe(ArrayList<Indian> indians, String tribe) {
        int[] menAndWomen = new int[2];
        for (Indian indian : indians) {
            if (indian.getTribe().equals(tribe)) {
                if (indian.getGender() == Gender.MALE) {
                    menAndWomen[0]++;
                } else {
                    menAndWomen[1]++;
                }
            }
        }
        return menAndWomen;
    }

    public static int countMembersOfTribe(ArrayList<Indian> indians, String tribe) {
        int counter = 0;
        for (Indian indian : indians) {
            if (indian.getTribe().equals(tribe)) {
                counter++;
            }
        }
        return counter;
    }

    public static HashSet<String> indianEquipments(ArrayList<Indian> indians) {
        HashSet<String> stuff = new HashSet<>();
        for (Indian indian : indians) {
            for (String equipment : indian.getEquipment()) {
                stuff.add(equipment);
            }
        }
        return stuff;
    }

    public static ArrayList<Indian> dataIntoArrayList(String filePath) throws FileNotFoundException {
        ArrayList<Indian> indians = new ArrayList<>();
        Scanner s = new Scanner(new File(filePath));
        for (int i = 0; s.hasNextLine(); i++) {
            String[] sor = s.nextLine().split(",");
            String name = sor[0];
            String tribe = sor[1];
            Gender gender = null;
            switch (sor[2]) {
                case "f":
                    gender = Gender.MALE;
                    break;
                case "n":
                    gender = Gender.FEMALE;
                    break;
            }
            String age = sor[3];
            int kor = Integer.parseInt(age);
            String stuff = sor[4];
            String[] equipments = stuff.split("\\|");
            ArrayList<String> equipment = new ArrayList<>();
            for (int k = 0; k < equipments.length; k++) {
                equipment.add(equipments[k]);
            }
            indians.add(new Indian(name, tribe, gender, kor, equipment));
        }
        return indians;
    }
}
