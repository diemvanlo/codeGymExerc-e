package com.company.exerciseThree;

import com.company.exerciseTwo.three.NegativeNumberException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NegativeNumberException {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.print("Enter value need to delete: ");
        int[] result = new int[9];

        byte value = 0;
        try {
            value = sc.nextByte();
        } catch (Exception exception) {
            throw new NegativeNumberException("Not byte number");
        }
        for (int i = 0; i <= 9; i++) {
            if (value != array[i]) {
                System.out.println(array[i]);
            }
        }
        int number = sc.nextInt();
    }
}
