package com.company;

public class QuadraticEquationMath {
    private QuadraticEquationMath() {
    }

    public static ComplexNumber[] resolveQuadraticEquation(QuadraticEquation qe) {
        return getRoots(qe);
    }

    private static ComplexNumber getDiscriminant(QuadraticEquation qe) {
        return ComplexMath.substract(ComplexMath.multiply(qe.getB(), qe.getB()),
                ComplexMath.multiply(new ComplexNumber(4, 0), ComplexMath.multiply(qe.getA(), qe.getC())));
    }

    private static ComplexNumber[] getRoots(QuadraticEquation qe) {
        ComplexNumber[] results;
        ComplexNumber discriminant = getDiscriminant(qe);
        ComplexNumber[] discriminant_roots = ComplexMath.squareRoot(discriminant);
        if (discriminant.getRealPart() == 0 && discriminant.getImaginaryPart() == 0) {
            results = new ComplexNumber[1];
            results[0] = ComplexMath.divide(ComplexMath.add(ComplexMath.substract(qe.getB()), discriminant_roots[0]),
                    ComplexMath.multiply(new ComplexNumber(2, 0), qe.getA()));
        } else {
            results = new ComplexNumber[2];
            for (int i = 0; i < 2; i++) {
                results[i] = ComplexMath.divide(ComplexMath.add(ComplexMath.substract(qe.getB()), discriminant_roots[i]),
                        ComplexMath.multiply(new ComplexNumber(2, 0), qe.getA()));
            }
        }
        return results;
    }
}
