// carpim matriksi hesaplayan program.
// made by dbugraer.

import java.util.Scanner;
import java.util.Random;

public class Matris5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N degerini giriniz : ");
        int N = input.nextInt();

        int[][] Amatris = new int[N][N];
        int[][] Bmatris = new int[N][N];
        int[][] Cmatris = new int[N][N];

        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Amatris[i][j] = rand.nextInt(100);
                Bmatris[i][j] = rand.nextInt(100);
            }
        }

        System.out.println("A Matrisi:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Amatris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        

        System.out.println("B Matrisi:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Bmatris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        System.out.println("Carpim Matrisi (C = A * B):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cmatris[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    Cmatris[i][j] += Amatris[i][k] * Bmatris[k][j];
                }
                System.out.print(Cmatris[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
