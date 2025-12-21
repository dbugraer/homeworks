// tek matriksteki toplamlari bulan program.
// made by dbugraer.

import java.util.Scanner;

public class Matris4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N degerini giriniz : ");
        int N = input.nextInt();

        int[][] matris = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((i + 1) + " inci satir ve " + (j + 1) + " inci sutun : ");
                matris[i][j] = input.nextInt();
            }
        }
        int toplam = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                toplam += matris[i][j];
            }
        }
        System.out.println("Matrisin toplami : " + toplam);

    }
}