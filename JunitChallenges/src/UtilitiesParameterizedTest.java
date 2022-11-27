import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesParameterizedTest {
    private Utilities utils;

    @BeforeEach
    public void setup() {
        utils = new Utilities();
    }

    @ParameterizedTest
    @MethodSource("testConditions")
    void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input, String expected) {
        assertEquals(expected, utils.removePairs(input));
    }

    private static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),
                Arguments.of("112233445566", "123456"),
                Arguments.of("A", "A")
        );
    }
}
