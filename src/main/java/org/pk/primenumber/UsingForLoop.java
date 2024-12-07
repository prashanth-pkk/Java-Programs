package org.pk.primenumber;

public class UsingForLoop {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
