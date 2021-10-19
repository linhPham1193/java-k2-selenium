package Lesson02;

import java.util.Scanner;

import static java.lang.System.out;

public class bai01_05_06 {
    public static void main(String[] args) {

        out.println("Nhap vao so:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        // Tinh giai thua
        int answer = 1;
        for (int currentNum = 1; currentNum <= inputNumber; currentNum++) {
            answer = answer * currentNum;
        }
        System.out.printf("Giai thua cua %d la: %d", inputNumber, answer);
        out.println();

        //Kiem tra so nguyen to
        boolean laSnt = true;
        for (int soChia = 2; soChia < (inputNumber / 2); soChia++) {
            int phanDu = inputNumber % soChia;
            if (phanDu == 0) {
                laSnt = false;
                break;
            }
        }
        if (!laSnt) {
            System.out.printf("%d khong la so nguyen to", inputNumber);
        } else {
            System.out.printf("%d la so nguyen to", inputNumber);
        }
        out.println();

        //Tim so nguyen to <= inputNum
        int totalIndex = 0;
        for (int i = 1; i <= inputNumber; i++) {
            laSnt = true;
            for (int soChia = 2; soChia <= (i / 2); soChia++) {
                int phanDu = i % soChia;
                if (phanDu == 0) {
                    laSnt = false;
                    break;
                }
            }
//            if(laSnt){
//                System.out.print(i + ", ");
//            }
            if (laSnt) {
                totalIndex++;
            }
        }
        int[] myArr = new int[totalIndex];
        int index = 0;
        out.println("Day so nguyen to bao gom: ");
        for (int i = 1; i <= inputNumber; i++) {
            laSnt = true;
            for (int soChia = 2; soChia <= (i / 2); soChia++) {
                int phanDu = i % soChia;
                if (phanDu == 0) {
                    laSnt = false;
                    break;
                }
            }
            if (laSnt) {
                myArr[index] = i;
                if (index < (totalIndex - 1)) {
                    System.out.print(myArr[index] + ", ");
                } else {
                    System.out.print(myArr[totalIndex - 1]);
                }
                index++;
            }
        }

    }
}


