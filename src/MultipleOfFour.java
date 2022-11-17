import java.util.Scanner;

public class MultipleOfFour {
    public static void main(String[] args) {
        int k, total=0;
        boolean isContinuing = true;

        Scanner inp = new Scanner(System.in);

        while (isContinuing){
            System.out.print("Sayı Giriniz: ");
            k = inp.nextInt();
            if (k %4  == 0){
                total += k;
            }
            if (k %2  == 1){
                isContinuing = false;
            }
        }

        System.out.println("Sayıların Toplamı: " + total);
    }
}
