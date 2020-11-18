package PrisonerDilemma;

public interface Suspect {

    boolean confess(Suspect other);
    void setPunishment(Suspect other, int sentenceInYears);
}
