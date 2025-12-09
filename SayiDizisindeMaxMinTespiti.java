// n elemanli bir sayi dizisinin eb ve ek elemanlari dizinin hangi indisleri oldugunu bulan program.
// made by dbugraer.

import java.util.Scanner;

public class SayiDizisindeMaxMinTespiti {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu belirleyiniz : ");
        int boyut = input.nextInt();

        System.out.println("-------------------------------- ");

        int[] sayidizisi = new int[boyut];

        for (int i = 0; i < sayidizisi.length; i++) {
            System.out.print(i + " indeksli eleman : ");
            sayidizisi[i] = input.nextInt();
        }

        int enbuyuk = sayidizisi[0];
        int enkucuk = sayidizisi[0];
        int enkucukindeks = 0;
        int enbuyukindeks = 0;

        for (int i = 1; i < sayidizisi.length; i++) {
            if (sayidizisi[i] > enbuyuk) {
                enbuyuk = sayidizisi[i];
                enbuyukindeks = i;
            }
            if (sayidizisi[i] < enkucuk) {
                enkucuk = sayidizisi[i];
                enkucukindeks = i;
            }
        }

        System.out.println("-------------------------------- ");

        System.out.println("Sayi dizisinin en kucuk indeksli elemani : " + enkucukindeks);
        System.out.println("Sayi dizisinin en buyuk indeksli elemani : " + enbuyukindeks);

    }

}
