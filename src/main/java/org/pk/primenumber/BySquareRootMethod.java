package org.pk.primenumber;

public class BySquareRootMethod {
    public static void main(String[] args) {
        int num = 10;
        if (num <= 1) {
            System.out.println("it's not a prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
