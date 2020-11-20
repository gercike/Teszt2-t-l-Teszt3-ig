package PrisonerDilemma;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class BiasedSuspectTest {
    BiasedSuspect biasedBéla;

    @Before
    public void setUp() throws Exception {
        biasedBéla = new BiasedSuspect("biasedBéla");
    }

    @Test
    public void shouldBetrayBecauseFeelsBetrayed() {
        NiceSuspect niceGéza = new NiceSuspect("niceGéza");
        biasedBéla.betrayers.put(niceGéza, new LinkedList<>());
        biasedBéla.betrayers.get(niceGéza).add(2);
        boolean betray = biasedBéla.confess(niceGéza);
        Assert.assertTrue(betray);
        System.out.println(biasedBéla.betrayers);
    }

    @Test
    public void shouldCooperateBecauseHasNoHistory() {
        NiceSuspect niceGéza = new NiceSuspect("niceGéza");
        boolean betray = biasedBéla.confess(niceGéza);
        Assert.assertFalse(betray);
        System.out.println(biasedBéla.betrayers);
    }

    @Test
    public void shouldCooperateBecauseMoreHelpedThem() {

    }
}