import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {
    private Utilities utils;

    @BeforeEach
    public void setup() {
        utils = new Utilities();
    }

    @Test
    void everyNthChar() {
        char[] output = utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] {'e', 'l'}, output);
        char[] output2 = utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @Test
    void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull(utils.removePairs(null), "Did not return null");
        assertEquals("A", utils.removePairs("A"));
        assertEquals("", utils.removePairs(""));
    }

    @Test
    void converter() {
        assertEquals(300, utils.converter(10, 5));
    }

    @Test
    void converter_arithmeticException() {
        assertThrows(ArithmeticException.class,
                () -> utils.converter(10, 0));
    }

    @Test
    void nullIfOddLength() {
        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("even"));
    }
}