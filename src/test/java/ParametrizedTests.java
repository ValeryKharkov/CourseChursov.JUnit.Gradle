import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTests {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void soursTest(int parameter) {
        int actualSum = parameter + parameter;
        int expectedSum = parameter * 3;
        assertEquals(expectedSum, actualSum, "Суммы должны быть разные");
    }
}
