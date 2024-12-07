package org.pk.primenumber;

import java.util.stream.IntStream;

public class ByStreams {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrime = num > 1 && IntStream.range(2, (int) (Math.sqrt(num) + 1)).noneMatch(i -> num % i == 0);
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
