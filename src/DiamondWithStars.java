import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n değeri: ");
        int sayi = inp.nextInt();

        for (int i = 0; i < sayi ; i++) {
            for (int j = 1; j < (sayi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i = (sayi-1); i > 0; i--)
        {
            for(int j = sayi-i; j > 0; j--)
                System.out.print(" ");

            for (int j = 2*i - 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }

    }
}
