package Diziler.Pratik;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinBulmaOdev {
        public static void main(String[] args) {
            Integer[] list = {15,12,788,1,-1,-778,2,0};
            System.out.println("Dizi: " + Arrays.toString(list));

            Scanner inp = new Scanner(System.in);
            System.out.print("Bir Sayı Giriniz: ");
            int sayi = inp.nextInt();
            System.out.println("Girilen Sayı: " + sayi);


            ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(list));
            arrayList.add(sayi);
            list = arrayList.toArray(list);

            Arrays.sort(list);
            System.out.println("Dizi: " + Arrays.toString(list));
            int index = Arrays.binarySearch(list,sayi);

            System.out.println("Girilen sayıdan küçük en yakın sayı: " + list[index-1]);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[index+1]);

        }
}
