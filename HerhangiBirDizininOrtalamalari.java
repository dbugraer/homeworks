// n elemanli bir dizinin aritmetik , geometrik ve harmonik ortalamalarini hesaplayan program.
// made by dbugraer.
import java.util.Scanner;

public class HerhangiBirDizininOrtalamalari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen dizi boyutunu giriniz : ");
        int N = input.nextInt();

        int[] dizi = new int[N];

        for (int i = 0; i <= dizi.length - 1; i++) {
            System.out.print(i + " indeksli eleman : ");
            dizi[i] = input.nextInt();
        }
        int toplam = 0;
        for (int i = 0; i <= dizi.length - 1; i++) {
            toplam += dizi[i];
        }
        double aritmetikOrtalama = (double) toplam / dizi.length;
        System.out.println("Indekslerin Aritmetik Ortalamasi : " + aritmetikOrtalama);

        double carpim = 1.0;
        for (int i = 0; i <= dizi.length - 1; i++) {
            carpim *= dizi[i];
        }
        double geometrikOrtalama = Math.pow(carpim, 1.0 / N);
        System.out.println("Indekslein Geometrik Ortalamasi : " + geometrikOrtalama);

        double terstoplam = 0.0;
        for (int i = 0; i <= dizi.length - 1; i++) {
            terstoplam += (1.0 / dizi[i]);
        }
        double harmonikOrtalama = dizi.length / terstoplam;
        System.out.println("Indekslerin Harmonik Ortalamasi : " + harmonikOrtalama);

        // programin matematiksel hesaplamalari dogru verdigi kontrol edildi.      
    }

}
