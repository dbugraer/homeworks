// vektorlerin skaler carpimini bulan program.
// made by dbugraer.

import java.util.Scanner;

public class VektorCarpimIslemi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vektorlerin boyutunu giriniz : ");
        int N = input.nextInt();

        int[] vektorA = new int[N];
        int[] vektorB = new int[N];

        System.out.println("---- A vektorunu giriniz -----");
        for (int i = 0; i <= vektorA.length - 1; i++) {
            System.out.print("A [" + (i + 1) + "] :  ");
            vektorA[i] = input.nextInt();
        }

        System.out.println("---- B vektorunu giriniz -----");
        for (int i = 0; i <= vektorA.length - 1; i++) {
            System.out.print("B [" + (i + 1) + "] :  ");
            vektorB[i] = input.nextInt();
        }

        double skalercarpim = 0.0;
        for (int i = 0; i < N; i++) {
            skalercarpim += vektorA[i] * vektorB[i];
        }

        System.out.println("Iki vektorun skaler carpimi -->> " + skalercarpim);
        
    }

}
