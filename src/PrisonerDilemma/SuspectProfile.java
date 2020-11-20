package PrisonerDilemma;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class SuspectProfile implements Suspect {
    String name;
    Map<Suspect, LinkedList<Integer>> loyals = new HashMap<>();
    Map<Suspect, LinkedList<Integer>> betrayers = new HashMap<>();

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void setPunishment(Suspect other, int sentenceInYears) {
        if (sentenceInYears == 1 || sentenceInYears == 0) {
            loyals.putIfAbsent(other, new LinkedList<>());
            loyals.get(other).add(sentenceInYears);
        } else if (sentenceInYears == 3 || sentenceInYears == 2) {
            betrayers.putIfAbsent(other, new LinkedList<>());
            betrayers.get(other).add(sentenceInYears);
        }
    }
}
