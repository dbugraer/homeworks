// klavyeden girilen bir dizinin standart sapmasi ve varyantini hesaplayan program.
// made by dbugraer.
import java.util.Scanner;

public class DizideIslemler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dizi boyutunu giriniz : ");
        int n = input.nextInt();

        int[] sayidizisi = new int[n];

        for (int i = 0; i <= sayidizisi.length - 1; i++) {
            System.out.print(i + " indeksli eleman : ");
            sayidizisi[i] = input.nextInt();
        }

        int toplam = 0;
        for (int i = 0; i <= sayidizisi.length - 1; i++) {
            toplam += sayidizisi[i];
        }
        double aritmetikOrtalama = (double) toplam / sayidizisi.length;

        double karelerToplami = 0.0;
        for (int i = 0; i <= sayidizisi.length - 1; i++) {
            double fark = sayidizisi[i] - aritmetikOrtalama;
            double kare = Math.pow(fark, 2);
            karelerToplami += kare;
        }
        double varyans = karelerToplami / sayidizisi.length;
        double standartsapma = Math.sqrt(varyans);

        System.out.println("Sayi dizisinin standart sapmasi : " + standartsapma);
        System.out.println("Sayi dizisinin varyansi : " + varyans);
    }
}
