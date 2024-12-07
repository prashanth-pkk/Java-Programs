package org.pk.reversenumber;

public class UsingRecursion {

    public static int isReverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return isReverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        int i = 1234;
        System.out.println(isReverse(i, 0));
    }
}
