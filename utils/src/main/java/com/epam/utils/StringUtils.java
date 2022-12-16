package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        try {
            double number = Double.parseDouble(str);
            if (number > 0) {
                return true;
            }
        }
        catch (NumberFormatException e) {
            return false;
        }

        return false;
    }
}
