package org.pk.vowels;

public class ByUsingStreams {
    public static void main(String[] args) {
        String str = "java programming";
        long count = str.toLowerCase()
                .chars().filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println("Number of vowels : " + count);
    }
}
