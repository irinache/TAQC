package com.company;

public class Main {

    public static void main(String[] args) {
        // task 1.1 - create ComplexNumber class
        System.out.println("Demonstration of ComplexNumber class");
        ComplexNumber[] cn_array = {
                new ComplexNumber(13, 1),
                new ComplexNumber(7, -6),
                new ComplexNumber(3),
                new ComplexNumber(0, -1),
                new ComplexNumber(0)
        };
        for (ComplexNumber cn : cn_array) {
            System.out.println(cn);
        }

        // task 1.2 - create of ComplexMath class
        System.out.println("Demonstration of ComplexMath class");
        ComplexNumber cn1 = new ComplexNumber(1, 3);
        ComplexNumber cn2 = new ComplexNumber(4, -5);

        ComplexNumber res1 = ComplexMath.add(cn1, cn2);
        System.out.println("(" + cn1 + ") + (" + cn2 + ") = " + res1);

        ComplexNumber cn3 = new ComplexNumber(-2, 1);
        ComplexNumber cn4 = new ComplexNumber(3, 5);

        ComplexNumber res2 = ComplexMath.substract(cn3, cn4);
        System.out.println("(" + cn3 + ") - (" + cn4 + ") = " + res2);

        ComplexNumber cn5 = new ComplexNumber(1, -1);
        ComplexNumber cn6 = new ComplexNumber(3, 6);

        ComplexNumber res3 = ComplexMath.multiply(cn5, cn6);
        System.out.println("(" + cn5 + ") * (" + cn6 + ") = " + res3);

        ComplexNumber cn7 = new ComplexNumber(13, 1);
        ComplexNumber cn8 = new ComplexNumber(7, -6);

        ComplexNumber res4 = ComplexMath.divide(cn7, cn8);
        System.out.println("(" + cn7 + ") / (" + cn8 + ") = " + res4);

        ComplexNumber cn9 = new ComplexNumber(-4);
        ComplexNumber[] res5 = ComplexMath.squareRoot(cn9);
        System.out.println("sqrt(" + cn9 + "):");
        System.out.println("Roots:");
        for (ComplexNumber root : res5) {
            System.out.println(root);
        }

        // task 1.3 - create of program that resolves quadratic equations with complex numbers
        System.out.println("Demonstration of QuadraticEquation and QuadraticEquationMath classes");

        ComplexNumber a = new ComplexNumber(0, 1);
        ComplexNumber b = new ComplexNumber(3, -2);
        ComplexNumber c = new ComplexNumber(-6);

        QuadraticEquation qe_1 = new QuadraticEquation(a, b, c);
        System.out.println(qe_1);

        ComplexNumber[] roots_1 = qe_1.resolve();
        System.out.println("Roots:");
        for (ComplexNumber root : roots_1) {
            System.out.println(root);
        }

        QuadraticEquation qe_2 = new QuadraticEquation(5, 4, 4);
        System.out.println(qe_2);

        ComplexNumber[] roots_2 = qe_2.resolve();
        System.out.println("Roots:");
        for (ComplexNumber root : roots_2) {
            System.out.println(root);
        }

        // task 1.5 - create of class for base-5 numeral system
        System.out.println("Demonstration of QuinaryConverter class");

        QuinaryConverter qc = new QuinaryConverter();

        int num = 159;
        System.out.println("Input: " + num);
        System.out.println("Output: " + qc.toQuinary(num));

        QuinaryNumber qn = new QuinaryNumber("1114");
        System.out.println("Input: " + qn);
        System.out.println("Output: " + qc.toInt(qn));
    }
}
