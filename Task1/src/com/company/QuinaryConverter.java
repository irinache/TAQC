package com.company;

public class QuinaryConverter {
    private int base;

    public QuinaryConverter() {
        base = 5;
    }

    public QuinaryNumber toQuinary(int num) {
        String result = "";
        int remainder;
        while (num > base) {
            remainder = num % base;
            num = (num - remainder) / base;
            result += remainder;
        }
        result += num;
        QuinaryNumber qn = new QuinaryNumber(reverseString(result));
        return qn;
    }

    public int toInt(QuinaryNumber quinary_number) {
        int result = 0;
        int size = quinary_number.toString().length();
        String reverse = reverseString(quinary_number.toString());
        String[] digits = reverse.split("");

        for (int i = 0; i < size; i++) {
            result += Integer.parseInt(digits[i]) * Math.pow(base, i);
        }
        return result;
    }

    private String reverseString(String str) {
        String result = "";
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
}
