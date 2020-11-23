package Codewars.MorseCode;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    @Before
    public void setUp() throws Exception {
//        MorseCodeDecoder morseCodeDecoder = new MorseCodeDecoder();
//        System.out.println(morseCodeDecoder.decode(code));
    }

    @Test
    public void decode() throws FileNotFoundException {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }
}