// made by dbugraer.

import java.util.Scanner;

public class PolindromSayi {

    public static void main(String[] args) {
        System.out.println("Duz ve ters okunuslari ayni olan sayilara POLINDROM SAYI denir. ");
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");

        System.out.print("Bir adet sayi giriniz : ");
        int anasayi = input.nextInt();

        System.out.println("---------------------------");

        int gecicisayi = anasayi;
        int terssayi = 0;
        while (gecicisayi > 0) {
            int basamak = gecicisayi % 10;
            terssayi = (terssayi * 10) + basamak;
            gecicisayi = gecicisayi / 10;
        }
        if (anasayi == terssayi) {
            System.out.println(anasayi + " sayisi bir polindrom sayidir ! ");
        } else {
            System.out.println(anasayi + " sayisi bir polindrom sayi degildir !");
        }

    }
}
