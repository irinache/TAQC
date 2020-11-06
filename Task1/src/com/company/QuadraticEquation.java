package com.company;

public class QuadraticEquation {
    private ComplexNumber a;
    private ComplexNumber b;
    private ComplexNumber c;

    public QuadraticEquation(ComplexNumber a, ComplexNumber b, ComplexNumber c) {
        try {
            if (a.getComplexNumber().equals("0"))
                throw new Exception("Not a Quadratic Equation");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        try {
            if (a == 0)
                throw new Exception("Not a Quadratic Equation");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        this.a = new ComplexNumber(a, 0);
        this.b = new ComplexNumber(b, 0);
        this.c = new ComplexNumber(c, 0);
    }

    public void printQuadraticEquation() {
        System.out.println("(" + a.getComplexNumber() + ")*x^2 + (" + b.getComplexNumber() + ")*x + (" + c.getComplexNumber() + ") = 0");
    }

    public ComplexNumber getA() {
        return this.a;
    }

    public ComplexNumber getB() {
        return this.b;
    }

    public ComplexNumber getC() {
        return this.c;
    }
}
