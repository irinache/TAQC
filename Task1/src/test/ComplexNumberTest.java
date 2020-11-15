package test;

import com.company.ComplexNumber;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @org.junit.jupiter.api.Test
    void toStringTestRealPositiveAndImaginaryPositive() {
        ComplexNumber cn = new ComplexNumber(4, 6);
        String expected = "4+6i";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealNegativeAndImaginaryPositive() {
        ComplexNumber cn = new ComplexNumber(-14, 23);
        String expected = "-14+23i";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealPositiveAndImaginaryNegative() {
        ComplexNumber cn = new ComplexNumber(7, -5);
        String expected = "7-5i";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealNegativeAndImaginaryNegative() {
        ComplexNumber cn = new ComplexNumber(-27, -45);
        String expected = "-27-45i";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealZeroAndImaginaryNonzero() {
        ComplexNumber cn = new ComplexNumber(0, 5);
        String expected = "5i";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealNonzeroAndImaginaryZero() {
        ComplexNumber cn = new ComplexNumber(34);
        String expected = "34";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void toStringTestRealZeroAndImaginaryZero() {
        ComplexNumber cn = new ComplexNumber(0);
        String expected = "0";

        String actual = cn.toString();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getRealPartTestPositiveValue() {
        ComplexNumber cn = new ComplexNumber(5, 10);
        Double expected = 5.0;

        Double actual = cn.getRealPart();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getRealPartTestZeroValue() {
        ComplexNumber cn = new ComplexNumber(0, 10);
        Double expected = 0.0;

        Double actual = cn.getRealPart();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getRealPartTestNegativeValue() {
        ComplexNumber cn = new ComplexNumber(-9, 10);
        Double expected = -9.0;

        Double actual = cn.getRealPart();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getImaginaryPartTestPositiveValue() {
        ComplexNumber cn = new ComplexNumber(15, 1);
        Double expected = 1.0;

        Double actual = cn.getImaginaryPart();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getImaginaryPartTestZeroValue() {
        ComplexNumber cn = new ComplexNumber(15);
        Double expected = 0.0;

        Double actual = cn.getImaginaryPart();

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getImaginaryPartTestNegativeValue() {
        ComplexNumber cn = new ComplexNumber(15, -51);
        Double expected = -51.0;

        Double actual = cn.getImaginaryPart();

        assertEquals(expected, actual);
    }
}