// made by dbugraer

import java.util.Scanner;
import java.util.Random;

public class Notsistemi2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet ogrenci var ? : ");
        int satir = input.nextInt();
        System.out.print("Kac adet ders var ? : ");
        int sutun = input.nextInt();
        System.out.println("---------------");
        int[][] notlar = new int[satir][sutun];
        Random rnd = new Random();
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                notlar[i][j] = rnd.nextInt(100) + 1;
            }
        }
        for (int i = 0; i < satir; i++) {
            System.out.print((i + 1) + ". ogrenci : ");
            for (int j = 0; j < sutun; j++) {
                System.out.print("\t" + notlar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------");
        double[] ogrenciOrtalamalari = new double[satir];
        for (int i = 0; i < satir; i++) {
            int toplam = 0;
            for (int j = 0; j < sutun; j++) {
                toplam += notlar[i][j];
            }
            ogrenciOrtalamalari[i] = (double) toplam / sutun;
            System.out.println((i + 1) + ". ogrenci ortalamasi : " + ogrenciOrtalamalari[i] + "\t");
        }
        System.out.println("---------------");
        double[] dersOrtalamalari = new double[sutun];
        for (int j = 0; j < sutun; j++) {
            int toplam2 = 0;
            for (int i = 0; i < satir; i++) {
                toplam2 += notlar[i][j];
            }
            dersOrtalamalari[j] = (double) toplam2 / satir;
            System.out.println((j + 1) + ". ders ortalamasi : " + dersOrtalamalari[j] + "\t");
        }
        int[] dersmax = new int[sutun]; // en yuksek ders notunu alan kisi icin varsayimla basliyoruz.
        int[] dersmin = new int[sutun];
        for (int j = 0; j < sutun; j++) {
            dersmax[j] = notlar[0][j];
            dersmin[j] = notlar[0][j];
            int maxOgrenciIndex = 0;
            int minOgrenciIndex = 0;
            for (int i = 0; i < satir; i++) {
                if (notlar[i][j] > dersmax[j]) {
                    dersmax[j] = notlar[i][j];
                    maxOgrenciIndex = i;
                }
                if (notlar[i][j] < dersmin[j]) {
                    dersmin[j] = notlar[i][j];
                    minOgrenciIndex = i;
                }
            }
            System.out.println("-------------------------------------");
            System.out.println((j + 1) + ". DERS ANALIZI");
            System.out.println("En Yuksek : " + dersmax[j] + " (Alan: " + (maxOgrenciIndex + 1) + ". Ogrenci)");
            System.out.println("En Dusuk  : " + dersmin[j] + " (Alan: " + (minOgrenciIndex + 1) + ". Ogrenci)");
            System.out.println("Fark      : " + (dersmax[j] - dersmin[j]));
        }
    }
}
