import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, cikart=0;
        int n2 = 1, r2 = 1, cikart2 = 1;
        double komb;

        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) -- Kombinasyon için seçim yapın");
        System.out.print("n sayısı: ");
        n = inp.nextInt();
        System.out.print("r sayısı: ");
        r = inp.nextInt();
        cikart=(n-r);

        for (int i =1; i<=n; i++){
            n2 = i * n2;
        }
        for (int i =1; i<=r; i++){
            r2 = i * r2;
        }
        for (int i =1; i<=cikart; i++){
            cikart2 = i * cikart2;
        }

        komb = n2 / (r2 * cikart2);
        System.out.println("Kombinasyon Sonucu: " + komb);
    }
}
