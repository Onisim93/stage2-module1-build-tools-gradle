package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here

        if (args.size() == 0) return false;

        try {
            for (String s : args) {
                double number = Double.parseDouble(s);
                if (number < 1) return false;
            }
        }
        catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}