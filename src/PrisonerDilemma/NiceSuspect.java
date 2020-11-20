package PrisonerDilemma;

import java.util.LinkedList;

public class NiceSuspect extends SuspectProfile {
    public NiceSuspect(String name) {
        this.name = name;
    }

    @Override
    public boolean confess(Suspect other) {
        return false;
    }

    @Override
    public void setPunishment(Suspect other, int sentenceInYears) {
    }
}