package com.aot.lab;

import java.util.Scanner;

public class PriorElements {

    public static int[] takeInputArray(Scanner sc) {
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static int calculatePriorElement(int[] arr) {
        int count = 1;
        int maxi = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) count++;
            maxi = Math.max(maxi, arr[i]);
        }
        return count;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInputArray(sc);
        int count = calculatePriorElement(arr);
        System.out.println("Total count of the elements is: " + count);
    }
}
