// kullanicinin girdigi sayi dizisini tersten yazdiran program.
// made by dbugraer.

import java.util.Scanner;

public class DiziniTerstenYazdirilmasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir dizi boyutu giriniz : ");
        int N = input.nextInt();

        System.out.println("----------------------------------");

        int[] orijinaldizi = new int[N];

        for (int i = 0; i < orijinaldizi.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elamani : ");
            orijinaldizi[i] = input.nextInt();
        }

        int[] tersdizi = new int[N];
        int j = N - 1;

        for (int i = 0; i < N; i++) {
            tersdizi[j] = orijinaldizi[i];
            j--;
        }

        System.out.println("----------------------------------");
        System.out.print("Dizinin Tersi : ");

        for (int i = 0; i < N; i++) {
            System.out.print(tersdizi[i] + " ");
        }
        System.out.println();
        
    }

}
