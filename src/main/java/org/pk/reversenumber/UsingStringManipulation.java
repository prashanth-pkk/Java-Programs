package org.pk.reversenumber;

public class UsingStringManipulation {
    public static void main(String[] args) {
        int number = 12345;
        String str = Integer.toString(number);
        String revString = new StringBuilder(str).reverse().toString();
        int reversed = Integer.parseInt(revString);
        System.out.println("The reverse of the number : " + reversed);
    }
}
