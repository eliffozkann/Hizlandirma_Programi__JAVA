package Metotlar;

import java.util.Scanner;

public class UsluSayiRecursive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Sayı: ");
        int n = inp.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        int r = inp.nextInt();
        System.out.println(uslu(n, r));
    }
    static int uslu(int taban, int us){
        int toplam = 1;
        if(us == 0){
            return 1;
        }

        for (int i = 1; i <= us; i++){
            toplam *= taban;
        }
        return toplam;
    }
}
