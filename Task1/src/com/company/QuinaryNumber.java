package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuinaryNumber {
    private String number;

    public QuinaryNumber(String quinary_string) {
        if (!isQuinary(quinary_string)){
            throw new IllegalArgumentException("Invalid string. Cannot be converted to quinary number.");
        }
        this.number = quinary_string;
    }

    public String toString() {
        return number;
    }

    private boolean isQuinary(String str) {
        Pattern pattern = Pattern.compile("^[0-4]+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Integer.parseInt(this.number);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        QuinaryNumber other = (QuinaryNumber) obj;
        return this.number.equals(other.number);
    }
}
