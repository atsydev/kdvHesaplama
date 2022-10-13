package Uygulamalar;

import java.util.Scanner;

public class KdvHesaplayanProgram {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen KDV'siz ücreti giriniz");
        double ucret= scan.nextDouble();

        double kdv18= ucret*1.18;
        double kdv8= ucret*1.08;
        double kdvliFiyat= ucret>1000 ? kdv8 : kdv18;

        System.out.println(kdvliFiyat);

    }
}
