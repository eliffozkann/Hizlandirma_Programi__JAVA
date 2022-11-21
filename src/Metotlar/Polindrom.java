package Metotlar;

import java.util.Scanner;

public class Polindrom {

    static  boolean isPalindrom(int number) {
        int temp = number, revereseNumber=0, lastNumber;
        while (temp != 0){
            lastNumber = temp %10;
            revereseNumber = (revereseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == revereseNumber){
            System.out.println(number +" : Palindrom Sayıdır");
            return true;
        }else{
            System.out.println(number+ " : Palindrom Sayı Değildir");
            return false;
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        isPalindrom(number);
    }
}
