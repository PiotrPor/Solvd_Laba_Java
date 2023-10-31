package com.solvd.firsthomework;

public class Main {
    public static void main(String[] args) {
        
        if (args.length > 0) {
            System.out.println("Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            System.out.println("------------");
        }
        
        int[] arrayToSort = {20, 30, 11, 15, 35, 8, 44, 22, 26, 5};
        printArrayContentsInt(arrayToSort);
        bubblesortIntArray(arrayToSort);
        printArrayContentsInt(arrayToSort);
        return;
    }
    
    public static void bubblesortIntArray(int[] arr) {
        int xyz;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    xyz = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = xyz;
                }
            }
        }
        return;
    }
    
    public static void printArrayContentsInt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Integer.toString(arr[i]) + ", ");
        }
        System.out.print("\n");
        return;
    }
}