import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        int min=0, max=0;

        Scanner input = new Scanner (System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        int n=input.nextInt();

        for (int i=1; i <= n; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int data = input.nextInt();

            if (i==1)
            {
                max=data;
                min=data;
            }

            if (data>max)
                max=data;

            if (data<min)
                min=data;
        }

        System.out.println("En büyük rakam: " + max);
        System.out.println("En küçük rakam: " + min);
    }
}
