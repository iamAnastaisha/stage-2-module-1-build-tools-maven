package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int num;
        double number;
        try {
            num = Integer.parseInt(str);
            return num >= 0;
        } catch (NumberFormatException ex) {
            try {
                number = Double.parseDouble(str);
                return number >= 0.;
            } catch (NumberFormatException ex1) {
                System.out.println("Wrong data!");
            }
        }
        return false;
    }
}
