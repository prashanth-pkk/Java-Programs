package org.pk.pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                characterSet.add(ch);
            }
        }
        return characterSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        if (isPangram(input)) {
            System.out.println("This sentence is a pangram");
        } else {
            System.out.println("This sentence is not a pangram");
        }
    }
}
