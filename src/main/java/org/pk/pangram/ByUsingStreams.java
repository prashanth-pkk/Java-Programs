package org.pk.pangram;

public class ByUsingStreams {
    public static boolean isPangram(String str) {
        return str.toLowerCase().chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .distinct()
                .count() == 26;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (isPangram(str)) {
            System.out.println("This sentence is a pangram");
        } else {
            System.out.println("This sentence is not a pangram");
        }
    }
}
