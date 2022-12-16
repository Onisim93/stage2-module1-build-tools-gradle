package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String s : args) {
            int number = Integer.parseInt(s);
            if (number < 1) return false;
        }

        return true;
    }
}