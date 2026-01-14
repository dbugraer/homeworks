// made by dbugraer.

import java.util.Scanner;

public class BirBoyutluZorDiziSorusu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Olusacak dizilerin boyutunu giriniz : ");
        int N = input.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("A dizisinin " + (i + 1) + ". elemani : ");
            A[i] = input.nextInt();
        }

        System.out.println("-----------");

        for (int i = 0; i < N; i++) {
            System.out.print("B dizisinin " + (i + 1) + ". elemani : ");
            B[i] = input.nextInt();
        }

        System.out.println("-----------");

        for (int i = 0; i < N; i++) {
            System.out.print("C dizisinin " + (i + 1) + ". elemani : ");
            C[i] = input.nextInt();
        }

        for (int i = 0; i < N; i++) {
            D[i] = (A[i] + B[i]) - C[i];
        }

        for (int i = 0; i < N - 1 - i; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (D[j] < D[j + 1]) {
                    int gecici = D[j];
                    D[j] = D[j + 1];
                    D[j + 1] = gecici;
                }
            }
        }
        System.out.println("Buyukten kucuge siralanmis D dizisi (A+B)-C :");
        for (int eleman : D) {
            System.out.println(eleman + " ");
        }

    }

}
