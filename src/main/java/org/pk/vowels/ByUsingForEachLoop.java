package org.pk.vowels;

public class ByUsingForEachLoop {
    public static void main(String[] args) {
        String str = "every thing is depends on your mindset";
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("The number of vowels : " + count);
    }
}
