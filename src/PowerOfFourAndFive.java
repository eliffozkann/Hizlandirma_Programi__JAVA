import java.util.Scanner;

public class PowerOfFourAndFive {
    public static void main(String[] args) {
        int k, counter=1;
        boolean isContinuing = true;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();

        for (int i =1; i<=k; i++){
            if (i %4  == 0 && i %5  == 0){
                System.out.println(counter + ": " + i);
                counter++;
            }

        }
    }
}
