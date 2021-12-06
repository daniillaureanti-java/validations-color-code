package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);
        if(color==null||color.isEmpty()||color.trim().isEmpty())return false;
        Matcher matcher =pattern.matcher(color);
        if(matcher.matches()){
            return true;
        }else return false;

    }
}





