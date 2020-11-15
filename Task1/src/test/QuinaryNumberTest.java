package test;

import com.company.QuinaryConverter;
import com.company.QuinaryNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuinaryNumberTest {

    @Test
    void testToString() {
        QuinaryNumber qn = new QuinaryNumber("43");
        String expected = "43";

        String actual = qn.toString();

        assertEquals(expected, actual);
    }
}