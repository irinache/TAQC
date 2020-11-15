package com.company;

public class QuadraticEquation {
    private ComplexNumber coefficient_1;
    private ComplexNumber coefficient_2;
    private ComplexNumber coefficient_3;

    public QuadraticEquation(ComplexNumber coefficient_1, ComplexNumber coefficient_2, ComplexNumber coefficient_3) {
        this.coefficient_1 = coefficient_1;
        this.coefficient_2 = coefficient_2;
        this.coefficient_3 = coefficient_3;
    }

    public QuadraticEquation(double coefficient_1, double coefficient_2, double coefficient_3) {
        this(new ComplexNumber(coefficient_1), new ComplexNumber(coefficient_2), new ComplexNumber(coefficient_3));
    }

    public ComplexNumber getCoefficient1() {
        return coefficient_1;
    }

    public ComplexNumber getCoefficient2() {
        return coefficient_2;
    }

    public ComplexNumber getCoefficient3() {
        return coefficient_3;
    }

    public String toString() {
        return "(" + getCoefficient1() + ")*x^2 + ("
                + getCoefficient2() + ")*x + ("
                + getCoefficient3() + ") = 0";
    }

    /**
     * Method for resolving equations. Returns  [x1, x2] if equation is quadratic results, else method returns [x].
     */
    public ComplexNumber[] resolve() {
        ComplexNumber[] results;
        if (coefficient_1.getRealPart() == 0 && coefficient_1.getImaginaryPart() == 0) {
            results = getSimpleEquationRoot();
        } else {
            results = getQuadraticEquationRoots();
        }
        return results;
    }

    private ComplexNumber[] getSimpleEquationRoot() {
        ComplexNumber[] result = {ComplexMath.getReciprocal(ComplexMath.divide(coefficient_3, coefficient_2))};
        return result;
    }

    /**
     * Method for getting root or roots of the equations.
     * Returns  [x1, x2] if equation has two roots (D > 0 or D < 0) or [x] if equation has 1 root (D = 0).
     */
    private ComplexNumber[] getQuadraticEquationRoots() {
        ComplexNumber[] results;
        ComplexNumber discriminant = getDiscriminant();
        ComplexNumber[] discriminant_roots = ComplexMath.squareRoot(discriminant);
        if (discriminant.getRealPart() == 0 && discriminant.getImaginaryPart() == 0) {
            results = new ComplexNumber[1];
            results[0] = ComplexMath.divide(ComplexMath.add(ComplexMath.getReciprocal(getCoefficient2()), discriminant_roots[0]),
                    ComplexMath.multiply(new ComplexNumber(2, 0), getCoefficient1()));
        } else {
            results = new ComplexNumber[2];
            for (int i = 0; i < 2; i++) {
                results[i] = ComplexMath.divide(ComplexMath.add(ComplexMath.getReciprocal(getCoefficient2()), discriminant_roots[i]),
                        ComplexMath.multiply(new ComplexNumber(2, 0), getCoefficient1()));
            }
        }
        return results;
    }

    private ComplexNumber getDiscriminant() {
        return ComplexMath.substract(ComplexMath.multiply(getCoefficient2(), getCoefficient2()),
                ComplexMath.multiply(new ComplexNumber(4, 0), ComplexMath.multiply(getCoefficient1(), getCoefficient3())));
    }
}
