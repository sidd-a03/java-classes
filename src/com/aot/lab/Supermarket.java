package com.aot.lab;

import java.util.Scanner;

public class Supermarket {

    public static int inputNumber(Scanner sc) {
        System.out.print("Input the number: ");
        /*Take Input*/
        return sc.nextInt();
    }

    public static int calculatedPrice(int n) {
        int rem, price = 1;
        /* Application Login */
        while (n > 0) {
            // Calculated remainder
            rem = n % 10;

            // Calculate price
            price *= rem;

            // update n
            n /= 10;
        }
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = inputNumber(sc);
        int price = calculatedPrice(n);
        System.out.println("The price of the product is " + price);
    }
}
