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
}
