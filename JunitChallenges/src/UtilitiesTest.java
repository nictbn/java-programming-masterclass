import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void everyNthChar() {
        fail("Empty test");
    }

    @Test
    void removePairs() {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull(util.removePairs(null), "Did not return null");
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    void converter() {
        fail("Empty test");
    }

    @Test
    void nullIfOddLength() {
        fail("Empty test");
    }
}