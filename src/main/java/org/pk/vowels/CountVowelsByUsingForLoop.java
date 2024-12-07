package org.pk.vowels;

public class CountVowelsByUsingForLoop {
    public static void main(String[] args) {
        String str = "hello java programming";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("The number of vowels : " + count);
    }
}
