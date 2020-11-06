package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuinaryConverter {
    private static int base = 5;

    private QuinaryConverter() {
    }

    public static String toQuinaryString(int num) {
        String result = "";
        int remainder;
        while (num > base) {
            remainder = num % base;
            num = (num - remainder) / base;
            result += remainder;
        }
        result += num;
        return reverseString(result);
    }

    public static int fromQuinaryStringToInt(String qStr) {
        if (isQuinary(qStr)) {
            int result = 0;
            int size = qStr.length();
            qStr = reverseString(qStr);
            String[] digits = qStr.split("");

            for (int i = 0; i < size; i++) {
                result += Integer.parseInt(digits[i]) * Math.pow(base, i);
            }
            return result;
        } else {
            return -1;
        }
    }

    public static boolean isQuinary(String str) {
        Pattern pattern = Pattern.compile("^[0-4]+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static String reverseString(String str) {
        String result = "";
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }
}
