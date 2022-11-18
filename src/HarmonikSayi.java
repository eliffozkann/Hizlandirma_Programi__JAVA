import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int sayi;
        double sum=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Harmonik seriye dahil olacak bir sayı giriniz: ");
        sayi = inp.nextInt();

        for (int i=1; i<=sayi; i++) {
            sum = sum + (1.0/i); //sonucun double çıkması için bölme sayısındaki her iki sayıdan birini DOUBLE tanımlamak gerekir!!!!!!
        }
        System.out.println(sum);

    }
}
