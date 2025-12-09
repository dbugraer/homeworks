// made by dbugraer

import java.util.Scanner;

public class Armstrongsayi {

    public static void main(String[] args) {
        System.out.println("n basamakli bir sayinin n. ustlerinin toplami , sayinin kendisine esitse bu sayiya ARMSTRONG SAYI denir.");
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------");

        System.out.print("Kontrol edilecek sayiyi giriniz: ");
        int anaSayi = input.nextInt();

        int tempSayi = anaSayi;
        int basamakSayisi = 0;

        while (tempSayi > 0) {
            tempSayi = tempSayi / 10;
            basamakSayisi++;
        }

        tempSayi = anaSayi;
        int toplam = 0;

        while (tempSayi > 0) {
            int basamak = tempSayi % 10;
            int carpimSonucu = 1;

            for (int i = 1; i <= basamakSayisi; i++) {
                carpimSonucu = carpimSonucu * basamak;
            }

            toplam = toplam + carpimSonucu;

            tempSayi = tempSayi / 10;
        }

        System.out.println("-----------------------------------");

        if (toplam == anaSayi) {
            System.out.println(anaSayi + " bir Armstrong sayisidir!");
        } else {
            System.out.println(anaSayi + " bir Armstrong sayisi DEGILDIR.");
        }
    }
}
