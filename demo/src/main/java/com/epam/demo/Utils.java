package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.size() == 0) {
            return false;
        }
       for (String str : args) {
           if (str == null || str.length() == 0) {
               return false;
           }
           try {
               double num = Double.parseDouble(str);
               if (num <= 0.)
                   return false;
           } catch (NumberFormatException ex) {
               return false;
           }
       }
       return true;
    }
}