package Metotlar;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = inp.nextInt();
        System.out.println(prime(n, 2));
    }
    static boolean prime(int sayi, int bolen) {

        if (sayi == bolen){
            System.out.println(sayi + ": Asal Sayıdır.");
            return true;
        }
        if (sayi % bolen == 0){
            System.out.println(sayi + ": Asal Sayı Değildir.");
            return false;
        }

        return prime(sayi, bolen++);
    }
}
