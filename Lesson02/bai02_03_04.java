package Lesson02;

import java.util.Arrays;
import java.util.Scanner;

public class bai02_03_04 {
    public static void main(String[] args) {
        System.out.println("Day so bao gom: ");
        Scanner i = new Scanner(System.in);
        int inputNum = i.nextInt();
        int[] myArr = new int[inputNum];

        for (int index = 0; index < inputNum; index++) {
            System.out.printf("Nhap vao so thu %d: ", index);
            Scanner scanner = new Scanner(System.in);
            myArr[index] = scanner.nextInt();
        }
        //Tinh trung binh cong 1 mang cac so nguyen
        int average = Arrays.stream(myArr).sum() / myArr.length;
        System.out.printf("TBC la: %d", average);
        System.out.println();

        //Tim so lon nhat
        int max = myArr[0];
        for (int compare : myArr) {
            if (max < compare) {
                max = compare;
            }
        }
        System.out.printf("So lon nhat la: %d", max);
        System.out.println();

        //Sap xep so tang dan
        for (int index = 0; index < inputNum; index++) {
            for (int indexNext = index + 1; indexNext < inputNum; indexNext++) {
                if (myArr[index] > myArr[indexNext]) {
                    int temporary = myArr[index];
                    myArr[index] = myArr[indexNext];
                    myArr[indexNext] = temporary;
                }
            }
        }
        System.out.println("Day so tang dan la: ");
        for (int index = 0; index < (inputNum - 1); index++) {
            System.out.print(myArr[index] + ", ");
        }
        System.out.print(myArr[inputNum - 1]);
    }
}
