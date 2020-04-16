package com.company.exerciseTwo.three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        System.out.println(printPrimeNumber(n));
    }

    public static String printPrimeNumber(int n) {
        String result = "";
        for (int i = 2; i <= n; i++) {
            int nn = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    nn = 1;
                    break;
                }
            }
            if (nn == 0){
                System.out.println(i);
            }
        }

        return result;
    }
}
