package Lesson03;

import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        //bai03
        char [] myChar = inputString.toCharArray();
        String myInt = "";

        for (char c : myChar) {
            if (Character.isDigit(c)){
                myInt = myInt + c;
            }
        }
        int isDigit = Integer.parseInt(myInt);
        System.out.println("Output: " + isDigit);

        //bai04
        String[] splitSt1 = inputString.split("://");
        String[] splitSt2 = splitSt1[1].split("\\.");

        System.out.println("protocol is: " + splitSt1[0]);
        System.out.println("domain is: " + splitSt2[0]);
        System.out.println("top-level domain is: " + splitSt2[1]);
    }
}
