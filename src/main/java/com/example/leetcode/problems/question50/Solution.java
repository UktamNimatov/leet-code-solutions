package com.example.leetcode.problems.question50;

public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;

        while (N > 0) {
            if ((N % 2) == 1) {
                result *= currentProduct; // result = 5 * 25
            }
            currentProduct *= currentProduct; // currentProduct = 25
            N /= 2; // N = 1
        }

        return result;
    }
}
