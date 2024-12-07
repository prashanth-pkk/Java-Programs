package org.pk.reversenumber;

public class UsingWhileLoop {
    public static void main(String[] args) {
        int number = 12345;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse of the number : " + rev);
    }
}
