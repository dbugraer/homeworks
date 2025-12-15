// girilen 2 farkli dizinin tek bir dev dizide toplanmasi ve yazdirilmasini saglayan program.
// made by dbugraer.

import java.util.Scanner;

public class DizilerinBirlesimi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen 1.dizinin boyutunu giriniz : ");
        int N = input.nextInt();
        int[] dizi1 = new int[N];

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print((i + 1) + ". elaman : ");
            dizi1[i] = input.nextInt();
        }

        System.out.println("--------------------------------");

        System.out.print("Lutfen 2.dizinin boyutunu giriniz : ");
        int n = input.nextInt();
        int[] dizi2 = new int[n];

        for (int i = 0; i < dizi2.length; i++) {
            System.out.print((i + 1) + ". elaman : ");
            dizi2[i] = input.nextInt();
        }

        System.out.println("--------------------------------");

        int[] dizi3 = new int[N + n];
        int sira = 0;

        for (int i = 0; i < dizi1.length; i++) {
            dizi3[sira] = dizi1[i];
            sira++;
        }

        for (int i = 0; i < dizi2.length; i++) {
            dizi3[sira] = dizi2[i];
            sira++;
        }

        System.out.println("Birlesmis Dizi (Dizi 3):");
        for (int i = 0; i < dizi3.length; i++) {
            System.out.print(dizi3[i] + " ");
        }
        System.out.println();
    }
}
