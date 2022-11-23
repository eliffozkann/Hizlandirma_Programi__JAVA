package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int k= input.nextInt();

        desen(k, k, 0);
    }

    static void desen(int number, int temp, int n) {
        if (number > 0 && n == 0) {
            System.out.print(number + " ");
            number -= 5;
            desen(number, temp, 0);
        } else if (number <= 0) {
            System.out.print(number + " ");
            number += 5;
            desen(number, temp, 1);
        } else if (number > 0 && number <= temp && n == 1) {
            System.out.print(number + " ");
            number += 5;
            desen(number, temp, 1);
        }
    }
}
