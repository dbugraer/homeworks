// kullanicidan kac tane ogrencinin notunun girilecegi istenir , ogrenci notlari sirayla girilir ve sinav ortalamasina gore kalan-gecen ogrenciler ekrana yazdirilir.
// made by dbugraer

import java.util.Scanner;

public class OgrenciNotSistemi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("OGRENCI NOTLARINA GORE DERSTEN GECME DURUMUNU KONTROL EDEN PROGRAM");
        System.out.println("------------------------------------------------------------------");
        
        System.out.print("Kac tane ogrencinin not girisini yapacaksiniz? : ");
        int N = input.nextInt();
        
        System.out.println("------------------------------------------------------------------");

        int[] notlar = new int[N];
        int notToplam = 0;

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + ". ogrencinin notunu giriniz (0-100) : ");
            int ogrenciNotu = input.nextInt();

            if (ogrenciNotu < 0 || ogrenciNotu > 100) {
                System.out.println("HATA! Not 0-100 arasinda olmalidir.");
                i--;      
                continue;
            }

            notlar[i] = ogrenciNotu;
            notToplam += ogrenciNotu;
        }

        System.out.println("------------------------------------------------------------------");

        double ortalama = (double) notToplam / N;
        System.out.println("Sinif Not Ortalamasi : " + ortalama);

        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < N; i++) {
            if (notlar[i] >= ortalama) {
                System.out.println((i + 1) + ". Ogrenci GECTI! ");
            } else {
                System.out.println((i + 1) + ". Ogrenci KALDI! ");
            }
        }
        
        System.out.println("------------------------------------------------------------------");
        
    }
}