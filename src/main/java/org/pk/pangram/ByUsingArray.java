package org.pk.pangram;

public class ByUsingArray {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        if (isPangram(input)) {
            System.out.println("This sentence is a pangram");
        } else {
            System.out.println("This sentence is not a pangram");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] alpha = new boolean[26];
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!alpha[index]) {
                    alpha[index] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }
}
