package org.pk.primenumber;

public class Recursion {
    public static boolean isPrime(int num, int i) {
        if (i * i > num) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(num, i + 1);
    }

    public static void main(String[] args) {
        int num = 10;
        if (num <= 1) {
            System.out.println("Not a prime number");
        } else {
            if (isPrime(num, 2)) {
                System.out.println("prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }
}
