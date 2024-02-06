package com.lucadani;

import java.util.Scanner;

public class Main {
    static double convertMillisToSeconds(long val) {
        return (double) val / 1000;
    }

    static long fibo(int n) {
        if (n <= 1) {
            return n;
        }
        long[] fiboArray = new long[n + 1];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        for (int i = 2; i <= n; fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2], ++i);
        return fiboArray[n];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.print("n = ");
        int n = scanner.nextInt();
        long resultFibo = fibo(n);
        System.out.println("fibo(" + n + ") = " + resultFibo);
        long endTime = System.currentTimeMillis();
        double totalTimeInSeconds = convertMillisToSeconds(Math.abs(startTime - endTime));
        System.out.println("fibo(" + n + ") calculation took " + totalTimeInSeconds + " seconds");
    }
}