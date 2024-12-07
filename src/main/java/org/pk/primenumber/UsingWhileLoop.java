package org.pk.primenumber;

public class UsingWhileLoop {
    public static void main(String[] args) {
        int num = 12;
        int i = 2;
        if (i <= 1) {
            System.out.println("not a prime number");
            return;
        }
        boolean isPrime = true;
        while (i * i <= num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
