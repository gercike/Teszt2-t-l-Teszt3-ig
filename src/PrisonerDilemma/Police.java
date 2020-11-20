package PrisonerDilemma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Police {

    static List<Suspect> suspects = new ArrayList<>();
    static Map<Suspect, Integer> statistics = new HashMap<>();

    public static void main(String[] args) {
        Suspect niceBéla = new NiceSuspect("niceBéla");
        Suspect biasedLajos = new BiasedSuspect("biasedLajos");
        suspects.add(niceBéla);
        suspects.add(biasedLajos);
        simulate();
    }

    static void simulate() {
        for (int i = 0; i < suspects.size(); i = i + 2) {
            pairInterrogation(suspects.get(i), suspects.get(i + 1));
        }
        System.out.println(statistics);
    }

    static void pairInterrogation(Suspect s1, Suspect s2) {
        boolean confessionS1 = s1.confess(s2);
        boolean confessionS2 = s2.confess(s1);
        if (confessionS1 && confessionS2) {
            s1.setPunishment(s2, 2);
            s2.setPunishment(s1, 2);
            statistics.putIfAbsent(s1, 2);
            statistics.putIfAbsent(s2, 2);
        }
        if (confessionS1 && !confessionS2) {
            s1.setPunishment(s2, 0);
            s2.setPunishment(s1, 3);
            statistics.putIfAbsent(s1, 0);
            statistics.putIfAbsent(s2, 3);
        }
        if (!confessionS1 && confessionS2) {
            s1.setPunishment(s2, 3);
            s2.setPunishment(s1, 0);
            statistics.putIfAbsent(s1, 3);
            statistics.putIfAbsent(s2, 0);
        }
        if (!confessionS1 && !confessionS2) {
            s1.setPunishment(s2, 1);
            s2.setPunishment(s1, 1);
            statistics.putIfAbsent(s1, 1);
            statistics.putIfAbsent(s2, 1);
        }
    }
}
