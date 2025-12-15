// klavyeden girilen herhangi bir sayinin yine bizim tanimladigimiz dizide kac defa gectigini bulan program.
// made by dbugraer.

import java.util.Scanner;

public class OzelDiziIslemleri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir dizi boyutu giriniz : ");
        int N = input.nextInt();

        System.out.println("----------------------------------");

        int[] dizi = new int[N];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elamani : ");
            dizi[i] = input.nextInt();
        }

        System.out.println("----------------------------------");

        System.out.print("Hangi sayiyi aramak istiyorsunuz? : ");
        int aranansayi = input.nextInt();

        System.out.println("----------------------------------");

        int adet = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranansayi) {
                adet++;
            }
        }
        if (adet > 0) {
            System.out.println("Aradiginiz " + aranansayi + " sayisi, dizide " + adet + " kez geciyor!");
        } else {
            System.out.println("Aradiginiz " + aranansayi + " sayisi dizide BULUNAMADI.");
        }
    }

}
