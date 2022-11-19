import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int number = inp.nextInt();


        for(int i = (number); i > 0; i--)
        {
            for(int j = number-i; j > 0; j--)
                System.out.print(" ");

            for (int j = 2*i - 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }

    }
}
