import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class javTest {

    @Test
    void testAdd() {
        jav calc = new jav();
        assertEquals(5, calc.add(2, 3));
    }
}
