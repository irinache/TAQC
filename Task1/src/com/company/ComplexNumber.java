package com.company;

public class ComplexNumber {
    private double a;
    private double b;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.a = realPart;
        this.b = imaginaryPart;
    }

    public String getComplexNumber() {
        String result = "";
        if (a != 0) {
            if (a % 1 != 0) {
                result = String.valueOf(a);
            } else {
                result = String.valueOf(Math.round(a));
            }
        }
        if (b > 0 && a != 0) {
            result += "+";
        } else if (b < 0) {
            result += "-";
        }
        if (b != 0) {
            if (a % 1 != 0) {
                result += Math.abs(b) + "i";
            } else {
                result += Math.abs(Math.round(b)) + "i";
            }
        }
        if (result.equals("")) {
            result = "0";
        }
        return result;
    }

    public void printComplexNumber() {
        System.out.println(this.getComplexNumber());
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }
}
