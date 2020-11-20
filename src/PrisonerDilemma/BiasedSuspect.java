package PrisonerDilemma;

import java.util.LinkedList;

public class BiasedSuspect extends SuspectProfile {
    public BiasedSuspect(String name) {
        this.name = name;
    }

    @Override
    public boolean confess(Suspect other) {
        if (betrayers.values().size() > loyals.values().size()) {
            return true;
        }
        return false;
    }
}