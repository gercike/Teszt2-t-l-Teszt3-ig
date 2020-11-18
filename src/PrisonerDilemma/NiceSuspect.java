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
        if (sentenceInYears == 1) {
            loyals.putIfAbsent(other, new LinkedList<>());
            loyals.get(other).add(sentenceInYears);
        } else if (sentenceInYears == 3) {
            betrayers.putIfAbsent(other, new LinkedList<>());
            betrayers.get(other).add(sentenceInYears);
        }
    }
}