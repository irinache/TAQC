package com.company;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    public String toString() {
        String result = "";
        if (realPart != 0) {
            if (realPart % 1 != 0) {
                result = String.valueOf(realPart);
            } else {
                result = String.valueOf(Math.round(realPart));
            }
        }
        if (imaginaryPart > 0 && realPart != 0) {
            result += "+";
        } else if (imaginaryPart < 0) {
            result += "-";
        }
        if (imaginaryPart != 0) {
            if (realPart % 1 != 0) {
                result += Math.abs(imaginaryPart) + "i";
            } else {
                result += Math.abs(Math.round(imaginaryPart)) + "i";
            }
        }
        if (result.equals("")) {
            result = "0";
        }
        return result;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) realPart;
        result = prime * result + (int) imaginaryPart;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        return this.realPart == other.realPart && this.imaginaryPart == other.imaginaryPart;
    }
}
