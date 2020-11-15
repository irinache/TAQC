package test;

import com.company.ComplexMath;
import com.company.ComplexNumber;
import com.company.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void getCoefficient1Test() {
        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        ComplexNumber expected = a;

        ComplexNumber actual = qe.getCoefficient1();

        assertEquals(expected, actual);
    }

    @Test
    void getCoefficient2() {
        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        ComplexNumber expected = b;

        ComplexNumber actual = qe.getCoefficient2();

        assertEquals(expected, actual);
    }

    @Test
    void getCoefficient3Test() {
        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        ComplexNumber expected = c;

        ComplexNumber actual = qe.getCoefficient3();

        assertEquals(expected, actual);
    }

    @Test
    void toStringTest() {
        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        String expected = "(1i)*x^2 + (3-2i)*x + (-6) = 0";

        String actual = qe.toString();

        assertEquals(expected, actual);
    }

    @Test
    void resolveTestWithRealNumbersAndRealRoots() {
        QuadraticEquation qe = new QuadraticEquation(4, 21, 5);
        ComplexNumber[] expected = {new ComplexNumber(-0.25), new ComplexNumber(-5)};

        ComplexNumber[] actual = qe.resolve();

        assertArrayEquals(expected, actual);
    }

    @Test
    void resolveTestWithComplexNumbersAndComplexRoots() {
        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        ComplexNumber[] expected = {new ComplexNumber(2), new ComplexNumber(0, 3)};

        ComplexNumber[] actual = qe.resolve();

        assertArrayEquals(expected, actual);
    }

    @Test
    void resolveTestWithRealNumbersAndComplexRoots() {
        QuadraticEquation qe = new QuadraticEquation(2, 6, 9);
        ComplexNumber[] expected = {new ComplexNumber(-1.5, 1.5), new ComplexNumber(-1.5, -1.5)};

        ComplexNumber[] actual = qe.resolve();

        assertArrayEquals(expected, actual);
    }

    @Test
    void resolveTestNonQuadraticEquationWithRealNumbers() {
        QuadraticEquation qe = new QuadraticEquation(0, 6, 9);
        ComplexNumber[] expected = {new ComplexNumber(-1.5)};

        ComplexNumber[] actual = qe.resolve();

        assertArrayEquals(expected, actual);
    }

    @Test
    void resolveTestNonQuadraticEquationWithComplexNumbers() {
        ComplexNumber a = new ComplexNumber(0);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 1);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        ComplexNumber[] expected = {new ComplexNumber(1.5385, 0.6923)};

        ComplexNumber[] actual = qe.resolve();

        assertArrayEquals(expected, actual);
    }
}