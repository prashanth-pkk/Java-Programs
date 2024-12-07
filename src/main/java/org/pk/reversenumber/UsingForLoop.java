package org.pk.reversenumber;

public class UsingForLoop {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        int temp = num;
        for (int i = temp; i > 0; temp = i /= 10) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
        }
        System.out.println("The reverse of the number : " + rev);
    }
}
