import java.util.Scanner;

public class AverageWithLoop {
    public static void main(String[] args) {
        int k, counter=0, total=0;
        double ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        for (int i = 1; i<=k; i++) {
            if (k % 3 == 0 && k %4  == 0){
                total += i;
                counter++;
            }
        }
        ort = total/counter;
        System.out.println("Sayıların Ortalaması: " + ort);
    }
}
