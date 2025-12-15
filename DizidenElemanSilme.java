// disaridan alinan bir dizinin elemanini secip sildikten sonra yeni diziyi ekrana yazdiran program.
// made by dbugraer.

import java.util.Scanner;

public class DizidenElemanSilme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen bir dizi boyutu giriniz : ");
        int N = input.nextInt();
        int[] dizi1 = new int[N];

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elamani : ");
            dizi1[i] = input.nextInt();
        }

        System.out.println("----------------------------------");

        int silinecekSayi;
        int silinecekAdet;

        while (true) {
            System.out.print("Lutfen diziden silinecek sayiyi giriniz : ");
            silinecekSayi = input.nextInt();

            silinecekAdet = 0;
            for (int i = 0; i < N; i++) {
                if (dizi1[i] == silinecekSayi) {
                    silinecekAdet++;
                }
            }

            if (silinecekAdet == 0) {
                System.out.println("HATA: Girdiginiz sayi dizide bulunamadi! Lutfen tekrar deneyin.");
                System.out.println("----------------------------------");
            } else {
                break;
            }
        }

        int yeniBoyut = N - silinecekAdet;
        int[] yeniDizi = new int[yeniBoyut];
        int sayac = 0;

        for (int i = 0; i < N; i++) {
            if (dizi1[i] != silinecekSayi) {
                yeniDizi[sayac] = dizi1[i];
                sayac++;
            }
        }

        System.out.println("----------------------------------");
        System.out.println("Temizlenmis Yeni Dizi:");

        for (int i = 0; i < yeniDizi.length; i++) {
            System.out.print(yeniDizi[i] + " ");
        }
        System.out.println();
    }
    // 
}