package test;

import com.company.QuinaryConverter;
import com.company.QuinaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuinaryConverterTest {

    @Test
    void toQuinaryTest() {
        int num = 23;
        QuinaryConverter qc = new QuinaryConverter();
        QuinaryNumber expected = new QuinaryNumber("43");

        QuinaryNumber actual = qc.toQuinary(num);

        assertEquals(expected, actual);
    }

    @Test
    void toIntTestPositive() {
        QuinaryNumber quinary_str = new QuinaryNumber("144");
        QuinaryConverter qc = new QuinaryConverter();
        int expected = 49;

        int actual = qc.toInt(quinary_str);

        assertEquals(expected, actual);
    }

    @Test
    void toIntTestNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuinaryNumber qn = new QuinaryNumber("164");
        });
    }
}