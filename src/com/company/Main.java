package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int n = scanner.nextInt();
        System.out.print("РЕЗУЛЬТАТ: ");
        numFib(n);
    }

    public static void numFib(int n) {
        int oneNum;
        int twoNum = 0;
        int tempSum = 1;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            oneNum = twoNum;
            twoNum = tempSum;
            tempSum = oneNum + twoNum;

            if (tempSum % 2 == 0) {
                sum += tempSum;
            }
        }
        System.out.println(sum);
    }
}



