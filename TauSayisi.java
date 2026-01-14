package ozelsayılar; 

import java.util.Scanner;

public class TauSayisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayi giriniz : ");
        int n = input.nextInt();
        int sayac = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sayac++;
            }
        }
        if (n % sayac == 0) {
            System.out.println(n + " sayisi bir tau sayidir.");
        } else {
            System.out.println(n + " sayisi bir tau sayisi degildir.");
        }
    }
}
