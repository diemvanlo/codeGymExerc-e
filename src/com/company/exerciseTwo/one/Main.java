package com.company.exerciseTwo.one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner draw = new Scanner(System.in);
        int choice;

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        choice = draw.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("Print the retangle");
                for (int i=0; i<=5; i++){
                    for (int j=0; j<=10; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 2 :
                System.out.println("Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                for (int i=0; i<=5; i++) {
                    for (int j=0; j<=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 3 :
                System.out.println("Print isosceles triangle");
                for (int i=0;i<=5;i++){
                    for (int j=i;j<=5;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 4 :
                System.out.println("Exit");
        }
    }
}
