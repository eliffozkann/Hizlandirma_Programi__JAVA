import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        double sayi;
        double kdvTutari1 = 0.18;
        double kdvTutari2 = 0.08;
        Scanner inp=new Scanner(System.in);

        System.out.print("Para Değeri Giriniz: ");
        sayi=inp.nextDouble();

        double secenek= (sayi <= 1000) ? kdvTutari1 : kdvTutari2;

        double kdvli=((sayi*secenek)/100)+sayi;

        System.out.println("KDVsiz Fiyat:" + sayi);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.println("KDV Tutarı: " + secenek);
    }
}
