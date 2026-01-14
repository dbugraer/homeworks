
import java.util.Scanner;

public class FaktorionSayi {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        System.out.print("Faktorion testi icin bir sayi giriniz: ");
        int girilenSayi = tarayici.nextInt();
        int geciciSayi = girilenSayi;
        int toplam = 0;
        while (geciciSayi > 0) {
            int basamak = geciciSayi % 10;
            int faktoriyel = 1;
            for (int i = 1; i <= basamak; i++) {
                faktoriyel *= i;
            }
            toplam = toplam + faktoriyel;
            geciciSayi = geciciSayi / 10;
        }

        System.out.println("-------------------------");

        if (toplam == girilenSayi) {
            System.out.println(girilenSayi + " bir FAKTORION sayisidir.");
        } else {
            System.out.println(girilenSayi + " bir Faktorion sayisi DEGILDIR.");
        }
        tarayici.close();
    }
}
