// sayisal loto programi. bilgisayar ayni sayiyi uretemiyor , kullanici ayni sayiyi giremiyor ve 1-49 arasi disinda bir sayi girilirse program yeni bir tahmin istiyor.
// made by dbugraer.

import java.util.Scanner;
import java.util.Random;

public class LotoProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] sansliSayilar = new int[6];
        int[] tahminler = new int[6];

        System.out.println(" ---- SAYISAL LOTO OYUNUNA HOS GELDINIZ ---- ");
        System.out.println("( Bilgisayar 1 ile 49 arasinda rastgele sayilar belirledi , tahminlerinize baslayabilirsiniz. Bol sans ! )11");

        for (int i = 0; i < sansliSayilar.length; i++) {
            int rastgeleSayi = rand.nextInt(49) + 1;
            boolean cakismaVar = false;

            for (int k = 0; k < i; k++) {
                if (sansliSayilar[k] == rastgeleSayi) {
                    cakismaVar = true;
                    break;
                }
            }

            if (cakismaVar) {
                i--;
            } else {
                sansliSayilar[i] = rastgeleSayi;
            }
        }

        for (int i = 0; i < tahminler.length; i++) {
            int girilenSayi;
            boolean gecerliMi = false;

            while (!gecerliMi) {
                System.out.print((i + 1) + ". tahminini gir: ");
                girilenSayi = input.nextInt();

                if (girilenSayi < 1 || girilenSayi > 49) {
                    System.out.println(" HATA: Lutfen 1 ile 49 arasinda bir sayi giriniz! ");
                    continue;
                }

                boolean cakismaVar = false;
                for (int k = 0; k < i; k++) {
                    if (tahminler[k] == girilenSayi) {
                        cakismaVar = true;
                        break;
                    }
                }

                if (cakismaVar) {
                    System.out.println(" HATA: Bu sayiyi daha once girdiniz! Farkli bir sayi secin. ");
                    continue;
                }

                tahminler[i] = girilenSayi;
                gecerliMi = true;
            }
        }

        System.out.println(" --- SONUCLAR --- ");

        int dogruSayisi = 0;
        for (int i = 0; i < tahminler.length; i++) {
            boolean bulunduMu = false;
            for (int j = 0; j < sansliSayilar.length; j++) {
                if (tahminler[i] == sansliSayilar[j]) {
                    bulunduMu = true;
                    break;
                }
            }

            if (bulunduMu) {
                System.out.println(" Tebrikler! " + tahminler[i] + " sayisi sansli sayilar arasinda VAR.");
                dogruSayisi++;
            } else {
                System.out.println(" Maalesef, " + tahminler[i] + " sayisi sansli sayilar arasinda YOK.");
            }
        }

        System.out.println(" -------------------------------- ");
        if (dogruSayisi == 6) {
            System.out.println(" TEBRİKLER! BUYUK İKRAMİYE! ");
        } else {
            System.out.println(" - Toplam " + dogruSayisi + " adet dogru tahmin yaptiniz. ");
        }

        System.out.print(" - Bilgisayarin rastgele belirlemis oldugu sayilar : ");
        for (int sayi : sansliSayilar) {
            System.out.print(sayi + " ");
        }

        System.out.println();
        
    }
}