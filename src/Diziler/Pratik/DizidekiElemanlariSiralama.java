package Diziler.Pratik;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {

        int startIndex = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = inp.nextInt();

        System.out.println("Dizinin elemanlarını giriniz: ");
        int[] dizi = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.print(i + 1 + ". Elemanı: ");
            int sayi = inp.nextInt();
            dizi[startIndex++] = sayi;
        }
        Arrays.sort(dizi);
        System.out.println("Sıralama: " + Arrays.toString(dizi));
    }
}
