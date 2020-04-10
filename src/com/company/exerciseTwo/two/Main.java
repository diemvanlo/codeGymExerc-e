package com.company.exerciseTwo.two;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner InputType = new Scanner(System.in);
        int NumPrime;
        System.out.println("nhap vao so ban muon kiem tra");
        NumPrime = InputType.nextInt();
        int count = 0;
        for (int i=1;i<=Math.sqrt(NumPrime);i++) {
            if (NumPrime % i ==0){
                count += 1;
            }
        }
        if (count ==1) {
            System.out.println(NumPrime + " la so nguyen to");
        }else {
            System.out.println(NumPrime + " khong la so nguyen to");
        }

    }
}
