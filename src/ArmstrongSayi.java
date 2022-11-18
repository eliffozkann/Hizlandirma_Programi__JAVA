import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        int sayi, k, carpim,basNumber=0, toplam=0, basamakSayisiToplami=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = inp.nextInt();
        int copySayi = sayi;

        //Basamak Sayısı için
        while (copySayi != 0) {
            copySayi /= 10;
            basNumber++;
        }

        copySayi = sayi;
        while (copySayi != 0) {
            k = copySayi % 10;
            basamakSayisiToplami += k;
            carpim = 1;
            for (int i = 1; i <= basNumber; i++) {
                carpim *= k;
            }
            toplam += carpim;
            copySayi /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + ": Armstrong sayıdır.");
        } else {
            System.out.println(sayi + ": Armstrong sayı değildir.");
        }
        System.out.println("Basamak Sayıları toplamı: " + basamakSayisiToplami);
    }
}
