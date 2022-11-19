import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        int toplam=0;

        Scanner input = new Scanner (System.in);
        System.out.print("Mükemmelliği Test Edilecek Sayı: ");
        int n = input.nextInt();

        for (int i=1; i < n; i++){
            if (n % i == 0)
            {
                toplam = toplam + i;
            }
        }

        if (toplam == n)
        {
            System.out.println(n + " Mükemmel Sayıdır.");
        } else {
            System.out.println(n + " Mükemmel Sayı Değildir.");
        }
    }
}
