import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n, r, toplam=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı: ");
        n = inp.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        r = inp.nextInt();


        for (int i =1; i<=r; i++){
            toplam = toplam * n;
        }

        System.out.println("İşlem Sonucu: " + toplam);
    }
}
