import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    public void testAdd() {
        calculator calc = new calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtract() {
        calculator calc = new calculator();
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        calculator calc = new calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        calculator calc = new calculator();
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        calculator calc = new calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(6, 0);
        });
    }
}


