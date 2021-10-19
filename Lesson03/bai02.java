package Lesson03;

import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        String myPass = "password123";
        int soLanNhap = 0;
        int nhapToiDa = 3;
//        do {
//            System.out.println("Please enter your password: ");
//            Scanner scanner = new Scanner(System.in);
//            String inputPass = scanner.nextLine();
//            if (inputPass.equals(myPass)){
//                System.out.println("Correct Password");
//                break;
//            } else {
//                System.out.println("Incorrect, please enter again");
//            }
//            soLanNhap++;
//        } while (soLanNhap < nhapToiDa);

        for(int i = soLanNhap;i < nhapToiDa;i++){
            System.out.println("Please enter your password: ");
            Scanner scanner = new Scanner(System.in);
            String inputPass = scanner.nextLine();
            if (inputPass.equals(myPass)){
                System.out.println("Correct Password");
                break;
            } else {
                System.out.println("Incorrect, please enter again");
            }
        }
    }
}
