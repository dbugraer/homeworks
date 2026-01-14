
import java.util.Scanner;

public class mersennesayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet mersenne sayisi listelemek istiyorsunuz ? : ");
        int n = input.nextInt();
        long kuvvet = 1;
        for (int i = 1; i <= n; i++) {
            kuvvet *= 2;
            long hesap = kuvvet - 1; // 2'nin kuvvetleri cok buyuk buyur.
            System.out.println((i) + ". mersenne sayisi : " + hesap);
        }
    }

}
