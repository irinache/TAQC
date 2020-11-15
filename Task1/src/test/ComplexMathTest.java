package test;

import com.company.ComplexMath;
import com.company.ComplexNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexMathTest {

    @Test
    void addTestPositiveOperands() {
        ComplexNumber operand_1 = new ComplexNumber(4, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, 3);
        ComplexNumber expected = new ComplexNumber(10, 10);

        ComplexNumber actual = ComplexMath.add(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void addTestNegativeOperands() {
        ComplexNumber operand_1 = new ComplexNumber(-4, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, -3);
        ComplexNumber expected = new ComplexNumber(2, 4);

        ComplexNumber actual = ComplexMath.add(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void addTestOperandsWithZeroValues() {
        ComplexNumber operand_1 = new ComplexNumber(0, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, 0);
        ComplexNumber expected = new ComplexNumber(6, 7);

        ComplexNumber actual = ComplexMath.add(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void substractTestPositiveOperands() {
        ComplexNumber operand_1 = new ComplexNumber(9, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, 5);
        ComplexNumber expected = new ComplexNumber(3, 2);

        ComplexNumber actual = ComplexMath.substract(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void substractTestNegativeOperands() {
        ComplexNumber operand_1 = new ComplexNumber(-9, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, -5);
        ComplexNumber expected = new ComplexNumber(-15, 12);

        ComplexNumber actual = ComplexMath.substract(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void substractTestOperandsWithZeroValues() {
        ComplexNumber operand_1 = new ComplexNumber(0, 7);
        ComplexNumber operand_2 = new ComplexNumber(6, 0);
        ComplexNumber expected = new ComplexNumber(-6, 7);

        ComplexNumber actual = ComplexMath.substract(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void getReciprocalTestWithPositiveValue() {
        ComplexNumber operand = new ComplexNumber(5, 7);
        ComplexNumber expected = new ComplexNumber(-5, -7);

        ComplexNumber actual = ComplexMath.getReciprocal(operand);

        assertEquals(expected, actual);
    }

    @Test
    void getReciprocalTestWithNegativeValue() {
        ComplexNumber operand = new ComplexNumber(-15, -2);
        ComplexNumber expected = new ComplexNumber(15, 2);

        ComplexNumber actual = ComplexMath.getReciprocal(operand);

        assertEquals(expected, actual);
    }

    @Test
    void getReciprocalTestWithZeroValue() {
        ComplexNumber operand = new ComplexNumber(0);
        ComplexNumber expected = new ComplexNumber(0);

        ComplexNumber actual = ComplexMath.getReciprocal(operand);

        assertEquals(expected, actual);
    }

    @Test
    void multiplyTestWithPositiveOperands() {
        ComplexNumber operand_1 = new ComplexNumber(6, 7);
        ComplexNumber operand_2 = new ComplexNumber(2, 3);
        ComplexNumber expected = new ComplexNumber(-9, 32);

        ComplexNumber actual = ComplexMath.multiply(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void multiplyTestWithOneNegativeOperand() {
        ComplexNumber operand_1 = new ComplexNumber(6, 7);
        ComplexNumber operand_2 = new ComplexNumber(-2, -3);
        ComplexNumber expected = new ComplexNumber(9, -32);

        ComplexNumber actual = ComplexMath.multiply(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void multiplyTestWithTwoNegativeOperands() {
        ComplexNumber operand_1 = new ComplexNumber(-5, -4);
        ComplexNumber operand_2 = new ComplexNumber(-2, -3);
        ComplexNumber expected = new ComplexNumber(-2, 23);

        ComplexNumber actual = ComplexMath.multiply(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void divideTestWithPositiveOperands() {
        ComplexNumber operand_1 = new ComplexNumber(6, 7);
        ComplexNumber operand_2 = new ComplexNumber(2, 3);
        ComplexNumber expected = new ComplexNumber(2.5385, -0.3077);

        ComplexNumber actual = ComplexMath.divide(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void divideTestWithOneNegativeOperand() {
        ComplexNumber operand_1 = new ComplexNumber(6, 7);
        ComplexNumber operand_2 = new ComplexNumber(-2, -3);
        ComplexNumber expected = new ComplexNumber(-2.5385, 0.3077);

        ComplexNumber actual = ComplexMath.divide(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void divideTestWithTwoNegativeOperands() {
        ComplexNumber operand_1 = new ComplexNumber(-8, -5);
        ComplexNumber operand_2 = new ComplexNumber(-12, -3);
        ComplexNumber expected = new ComplexNumber(0.7255, 0.2353);

        ComplexNumber actual = ComplexMath.divide(operand_1, operand_2);

        assertEquals(expected, actual);
    }

    @Test
    void squareRootTestWithPositiveRealNumber() {
        ComplexNumber operand = new ComplexNumber(16);
        ComplexNumber[] expected = {new ComplexNumber(4.0),
                new ComplexNumber(-4.0)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithNegativeRealNumber() {
        ComplexNumber operand = new ComplexNumber(-16, 0);
        ComplexNumber[] expected = {new ComplexNumber(0, 4),
                new ComplexNumber(0, -4)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithZero() {
        ComplexNumber operand = new ComplexNumber(0);
        ComplexNumber[] expected = {new ComplexNumber(0),
                new ComplexNumber(0)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithComplexNumberInFirstQuater() {
        ComplexNumber operand = new ComplexNumber(8, 5);
        ComplexNumber[] expected = {new ComplexNumber(2.9525, 0.8468),
                new ComplexNumber(-2.9525, -0.8468)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithComplexNumberInSecondQuater() {
        ComplexNumber operand = new ComplexNumber(-3, 7);
        ComplexNumber[] expected = {new ComplexNumber(1.5192, 2.3039),
                new ComplexNumber(-1.5192, -2.3039)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithComplexNumberInThirdQuater() {
        ComplexNumber operand = new ComplexNumber(-4, -3);
        ComplexNumber[] expected = {new ComplexNumber(0.7071, -2.1213),
                new ComplexNumber(-0.7071, 2.1213)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }

    @Test
    void squareRootTestWithComplexNumberInFourthQuater() {
        ComplexNumber operand = new ComplexNumber(9, -2);
        ComplexNumber[] expected = {new ComplexNumber(3.0182, -0.3313),
                new ComplexNumber(-3.0182, 0.3313)};

        ComplexNumber[] actual = ComplexMath.squareRoot(operand);

        assertArrayEquals(expected, actual);
    }
}