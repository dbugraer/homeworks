// kullanicinin tc kimlik numarasi girilecek , resmi prosedurlere gore uygunlugunu kontrol eden program.
// made by dbugraer

import java.util.Scanner;

public class TcKimlikKontrol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" --- TC KIMLIK NO DOGRULAMA SISTEMI --- ");
        System.out.println();

        int[] tcKimlik = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print(" Kimliginizin " + (i + 1) + ". basamagini giriniz : ");
            int N = input.nextInt();
            if (N < 0 || N > 9) {
                System.out.println(" HATA ! Sadece rakam (0-9) giriniz. ");
                i--;
                continue;
            }
            if (i == 0 && N == 0) {
                System.out.println(" HATA! TC Kimlik No 0 ile baslayamaz. ");
                i--;
                continue;
            }
            tcKimlik[i] = N;
        }

        System.out.println(" ------------------------------------- ");
        System.out.println();

        int teklertoplami = 0;
        int ciftlertoplami = 0;
        int ilkontoplam = 0;

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                teklertoplami = teklertoplami + tcKimlik[i];
            } else {
                ciftlertoplami = ciftlertoplami + tcKimlik[i];
            }
        }
        int hesaplananOnuncuHane = ((teklertoplami * 7) - ciftlertoplami) % 10;
        if (hesaplananOnuncuHane != tcKimlik[9]) {
            System.out.println(" TC Kimlik No GECERSIZDIR ! ");
            return;
        }

        int ilkOnHane = 0;

        for (int i = 0; i < 10; i++) {
            ilkOnHane = tcKimlik[i] + ilkOnHane;
        }

        if (ilkOnHane % 10 != tcKimlik[10]) {
            System.out.println(" TC Kimlik No GECERSIZDIR ! ");
        } else {
            System.out.println(" TC Kimlik NO GECERLIDIR ! ");
        }
    }
}
