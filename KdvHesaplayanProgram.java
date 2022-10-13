package Uygulamalar;

import java.util.Scanner;

public class KdvHesaplayanProgram {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen KDV'siz ücreti giriniz");
        double ucret= scan.nextDouble();

        double kdv18= ucret*1.18;
        double kdv8= ucret*1.08;
        double kdvTutari18= ucret*0.18;
        double kdvtutari8= ucret*0.08;
        double kdvliFiyat= ucret>1000 ? kdv8 : kdv18;
        double kdvtutari= ucret>1000 ? kdvtutari8 : kdvTutari18;
        System.out.println("Urunun Kdv'li tutarı: " + kdvliFiyat);
        System.out.println("Urunun Kdv'si: "+ kdvtutari );

    }
}
