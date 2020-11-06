package com.company;

public class Main {

    public static void main(String[] args) {
        // task 1.1 - create ComplexNumber class
        System.out.println("Demonstration of ComplexNumber class");
        ComplexNumber[] cn_array = {
                new ComplexNumber(13, 1),
                new ComplexNumber(7, -6),
                new ComplexNumber(3, 0),
                new ComplexNumber(0, -1),
                new ComplexNumber(0, 0)
        };
        for (ComplexNumber cn : cn_array) {
            cn.printComplexNumber();
        }

        // task 1.2 - create of ComplexMath class
        System.out.println("Demonstration of ComplexMath class");
        ComplexNumber cn1 = new ComplexNumber(1, 3);
        ComplexNumber cn2 = new ComplexNumber(4, -5);

        ComplexNumber res1 = ComplexMath.add(cn1, cn2);
        System.out.println("(" + cn1.getComplexNumber() + ") + (" + cn2.getComplexNumber() + ") = " + res1.getComplexNumber());

        ComplexNumber cn3 = new ComplexNumber(-2, 1);
        ComplexNumber cn4 = new ComplexNumber(3, 5);

        ComplexNumber res2 = ComplexMath.substract(cn3, cn4);
        System.out.println("(" + cn3.getComplexNumber() + ") - (" + cn4.getComplexNumber() + ") = " + res2.getComplexNumber());

        ComplexNumber cn5 = new ComplexNumber(1, -1);
        ComplexNumber cn6 = new ComplexNumber(3, 6);

        ComplexNumber res3 = ComplexMath.multiply(cn5, cn6);
        System.out.println("(" + cn5.getComplexNumber() + ") * (" + cn6.getComplexNumber() + ") = " + res3.getComplexNumber());

        ComplexNumber cn7 = new ComplexNumber(13, 1);
        ComplexNumber cn8 = new ComplexNumber(7, -6);

        ComplexNumber res4 = ComplexMath.divide(cn7, cn8);
        System.out.println("(" + cn7.getComplexNumber() + ") / (" + cn8.getComplexNumber() + ") = " + res4.getComplexNumber());

        ComplexNumber cn9 = new ComplexNumber(-4, 0);
        ComplexNumber[] res5 = ComplexMath.squareRoot(cn9);
        System.out.println("sqrt(" + cn9.getComplexNumber() + "):");
        System.out.println("Roots:");
        for (ComplexNumber root : res5) {
            root.printComplexNumber();
        }

        // task 1.3 - create of program that resolves quadratic equations with complex numbers
        System.out.println("Demonstration of QuadraticEquation and QuadraticEquationMath classes");

        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6, 0);

        QuadraticEquation qe_1 = new QuadraticEquation(a, b, c);
        qe_1.printQuadraticEquation();

        ComplexNumber[] roots_1 = QuadraticEquationMath.resolveQuadraticEquation(qe_1);
        System.out.println("Roots:");
        for (ComplexNumber root : roots_1) {
            root.printComplexNumber();
        }

        QuadraticEquation qe_2 = new QuadraticEquation(5, 4, 4);
        qe_2.printQuadraticEquation();

        ComplexNumber[] roots_2 = QuadraticEquationMath.resolveQuadraticEquation(qe_2);
        System.out.println("Roots:");
        for (ComplexNumber root : roots_2) {
            root.printComplexNumber();
        }

        // task 1.5 - create of class for base-5 numeral system
        System.out.println("Demonstration of QuinaryConverter class");

        int num = 159;
        System.out.println("Input: " + num);
        System.out.println("Output: " + QuinaryConverter.toQuinaryString(num));

        String quinaryString = "1114";
        System.out.println("Input: " + quinaryString);
        System.out.println("Output: " + QuinaryConverter.fromQuinaryStringToInt(quinaryString));
    }
}
