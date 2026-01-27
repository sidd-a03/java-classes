package com.aot.lab;

import java.util.Scanner;

public class Encoding {
    public static int[] inputArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] originalArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int temp = arr[n - 1];
        result[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            result[i] = arr[i] - temp;
            temp = result[i];
        }

        return result;
    }

    public static int sumofArray(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void printArray(int[] arr, int sum) {
        System.out.println("The original array elements are: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = inputArray(sc);
        int[] resultArray = originalArray(arr);
        int sum = sumofArray(resultArray);

        printArray(resultArray, sum);
    }
}
