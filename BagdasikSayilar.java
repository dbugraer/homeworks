// made by dbugraer.

import java.util.Scanner;

public class BagdasikSayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1, s2;
        while (true) {
            System.out.print("Lutfen iki basamakli 1. sayiyi giriniz: ");
            s1 = input.nextInt();
            System.out.print("Lutfen iki basamakli 2. sayiyi giriniz: ");
            s2 = input.nextInt();
            if ((s1 < 10 || s1 > 99) || (s2 < 10 || s2 > 99)) {
                System.out.println("HATA! Her iki sayi da 2 basamakli ve pozitif olmalidir. Tekrar deneyin.\n");
            } else {
                break;
            }
        }
        int s1onlar = s1 / 10;
        int s1birler = s1 % 10;
        int s2onlar = s2 / 10;
        int s2birler = s2 % 10;
        if (s1onlar == s2onlar && s2birler + s1birler == 10) {
            System.out.println("Sayilar bagdasiktir.");
        } else {
            System.out.println("Sayilar bagdasik degildir.");
        }
    }
}
