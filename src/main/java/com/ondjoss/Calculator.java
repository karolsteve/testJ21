package com.ondjoss;

/**
 * Created by Steve Tchatchouang at 01/02/2024
 */
public class Calculator {
    public static int sum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
