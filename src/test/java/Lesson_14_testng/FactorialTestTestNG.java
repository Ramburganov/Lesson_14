import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialTestTestNG {

    @Test
    public void testFactorialPositive() {
        assertEquals(Factorial.calculateFactorial(5), 120);
        assertEquals(Factorial.calculateFactorial(0), 1);
        assertEquals(Factorial.calculateFactorial(1), 1);
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}
