package com.company;

public class ComplexMath {
    private ComplexMath() {
    }

    private static double round(double num) {
        return Math.round((num) * 10000) / 10000.0d;
    }

    public static ComplexNumber add(ComplexNumber cn1, ComplexNumber cn2) {
        double realPart = round((cn1.getRealPart() + cn2.getRealPart()));
        double imaginaryPart = round((cn1.getImaginaryPart() + cn2.getImaginaryPart()));
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber substract(ComplexNumber cn1, ComplexNumber cn2) {
        double realPart = round((cn1.getRealPart() - cn2.getRealPart()));
        double imaginaryPart = round((cn1.getImaginaryPart() - cn2.getImaginaryPart()));
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber getReciprocal(ComplexNumber cn1) {
        double realPart = round(-cn1.getRealPart());
        double imaginaryPart = round(-cn1.getImaginaryPart());
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber multiply(ComplexNumber cn1, ComplexNumber cn2) {
        double realPart = round((cn1.getRealPart() * cn2.getRealPart() - cn1.getImaginaryPart() * cn2.getImaginaryPart()));
        double imaginaryPart = round((cn1.getRealPart() * cn2.getImaginaryPart() + cn1.getImaginaryPart() * cn2.getRealPart()));
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber divide(ComplexNumber cn1, ComplexNumber cn2) {
        double denominator = Math.pow(cn2.getRealPart(), 2) + Math.pow(cn2.getImaginaryPart(), 2);
        double realPart = round(((cn1.getRealPart() * cn2.getRealPart() + cn1.getImaginaryPart() * cn2.getImaginaryPart()) / denominator));
        double imaginaryPart = round(((-cn1.getRealPart() * cn2.getImaginaryPart() + cn1.getImaginaryPart() * cn2.getRealPart()) / denominator));
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public static ComplexNumber[] squareRoot(ComplexNumber cn) {
        ComplexNumber[] results = new ComplexNumber[2];
        int n = 2;
        double module = Math.sqrt(Math.pow(cn.getRealPart(), 2) + Math.pow(cn.getImaginaryPart(), 2));
        double argument = 0;
        if ((cn.getRealPart() > 0 && cn.getImaginaryPart() > 0)  //1st, 2nd quarters and on axis
                || (cn.getRealPart() < 0 && cn.getImaginaryPart() > 0)
                || (cn.getImaginaryPart() == 0)
                || (cn.getRealPart() == 0)) {
            argument = Math.acos(cn.getRealPart() / module);
        } else if ((cn.getRealPart() < 0 && cn.getImaginaryPart() < 0) //3st, 4nd quarters
                || (cn.getRealPart() > 0 && cn.getImaginaryPart() < 0)) {
            argument = -Math.acos(cn.getRealPart() / module);
        }
        for (int i = 0; i < n; i++) {
            double realPart = round(Math.sqrt(module) * (Math.cos((argument + 2 * Math.PI * i) / 2)));
            double imaginaryPart = round(Math.sqrt(module) * (Math.sin((argument + 2 * Math.PI * i) / 2)));
            results[i] = new ComplexNumber(realPart, imaginaryPart);
        }

        return results;
    }
}
