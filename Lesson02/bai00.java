package Lesson02;

import java.util.Scanner;

public class bai00 {
    public static void main(String[] args) {
        System.out.println("Please input one number:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        for (int currentNumber = 1; currentNumber <= inputNumber; currentNumber++){
            for (int i = 1; i <= currentNumber; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
