package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a index:");
        int index = Integer.parseInt(scanner.nextLine());

        if (index <= 1 && index > arr.length) System.out.println("không chèn được phần tử vào mảng");
        else {
            for(int i = arr.length - 1; i > 0; i--) {
                if (i > index) {
                    arr[i] = arr[i - 1];
                };
                if (i == index) {
                    arr[i] = X;
                }
            }
        }
        for (int n:arr) {
            System.out.println(n);
        }
    }
}
