import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUnitTests {
    @Test
    void sumNumbersTests() {
        /// AAA -> Arrange-Act-Assert
        int a = 3;
        int b = 4;

        int expectedResult = 7;
        int actualResult = a + b;

        assertEquals(expectedResult, actualResult);
    }
}
