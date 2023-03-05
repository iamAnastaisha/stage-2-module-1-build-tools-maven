package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null || args.size() == 0) {
            return false;
        }
       for (String str : args) {
           if (Integer.parseInt(str)  <= 0)
               return true;
       }
       return false;
    }
}