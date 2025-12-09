// kullanicidan ilk olarak nokta cifti sayisi istenir ardindan x-y degerleri islenir en son olarak bu ciftlerin koordinat sisteminde hangi bolgelerde oldugu teyit edilir.
// made by dbugraer.
import java.util.Scanner;

public class KartezyenBolgeTayini {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet nokta cifti gireceksiniz ? : ");
        int n = input.nextInt();

        System.out.println("------------------------------------");

        int[] xDizisi = new int[n];
        int[] yDizisi = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " . Nokta icin degerleri giriniz : ");

            System.out.print("x : ");
            xDizisi[i] = input.nextInt();

            System.out.print("y : ");
            yDizisi[i] = input.nextInt();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < n; i++) {
            int x = xDizisi[i];
            int y = yDizisi[i];

            System.out.print((i + 1) + ". Nokta (" + x + "," + y + ") -> ");

            if (x > 0 && y > 0) {
                System.out.println("1. Bolge");
            } else if (x < 0 && y > 0) {
                System.out.println("2. Bolge");
            } else if (x < 0 && y < 0) {
                System.out.println("3. Bolge");
            } else if (x > 0 && y < 0) {
                System.out.println("4. Bolge");
            } else {
                System.out.println("Eksen uzerinde veya orijin noktasinda.");
            }

        }
    }
}

