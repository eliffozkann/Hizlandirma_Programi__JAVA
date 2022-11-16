import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int n;

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }


        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        n = inp.nextInt();

        if (n %4 == 0) {
            System.out.println(n + " bir artık yıldır !");
        } else if (n %400 == 0) {
            System.out.println(n + " bir artık yıldır !");
        } else {
            System.out.println(n + " bir artık yıldır değildir !");
        }

    }
}
