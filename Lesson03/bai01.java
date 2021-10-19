package Lesson03;

import java.util.Scanner;

public class bai01 {
    public static void main(String[] args) {
        //Calculate how many minutes in total
//        String deBai = "2hrs and 5minutes";
//        int indexSoGio = deBai.indexOf("2");
//        int indexSoPhut = deBai.indexOf("5");
//        int soGio = Integer.parseInt(deBai.substring(0,1));
//        int soPhut = Integer.parseInt(deBai.substring(9,10));
//        int tongSoPhut = soGio*60 + soPhut;
//        System.out.println(tongSoPhut);

        System.out.println("Enter: ");
        Scanner enter = new Scanner(System.in);
        String deBai = enter.nextLine();
        int indexTruocSoGio = deBai.indexOf("hrs");
        int indexTruocSoPhut = deBai.indexOf("minutes");
        int indexAnd = deBai.indexOf("and");
        int soGio = Integer.parseInt(deBai.substring(0,indexTruocSoGio));
        int soPhut = Integer.parseInt(deBai.substring(indexAnd + 4,indexTruocSoPhut));
        int tongSoPhut = soGio*60 + soPhut;
        System.out.println("Tong so phut la: " + tongSoPhut);
    }
}
