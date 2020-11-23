package Codewars.MorseCode;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AdvancedMorseCodeDecoderTest {

    @Test
    public void decodeBits() throws FileNotFoundException {
        Assert.assertEquals("E", AdvancedMorseCodeDecoder.decodeMorse(AdvancedMorseCodeDecoder.decodeBits("1")));
        Assert.assertEquals("E", AdvancedMorseCodeDecoder.decodeMorse(AdvancedMorseCodeDecoder.decodeBits("01110")));
        Assert.assertEquals("HEY JUDE", AdvancedMorseCodeDecoder.decodeMorse(AdvancedMorseCodeDecoder.decodeBits(
                "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")));
    }
}