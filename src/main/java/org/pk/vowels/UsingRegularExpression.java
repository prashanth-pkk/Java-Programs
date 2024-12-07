package org.pk.vowels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsingRegularExpression {
    public static void main(String[] args) {
        String str = "Hello Universe";
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("The number of vowels : " + count);
    }
}
