package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    //1- Toplama İşlemi
    //2- Çıkarma İşlemi
    //3- Çarpma İşlemi
    //4- Bölme işlemi
    //5- Üslü Sayı Hesaplama
    //6- Faktoriyel Hesaplama
    //7- Mod Alma
    //8- Dikdörtgen Alan ve Çevre Hesabı

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Toplama işleminin devamı için 0 harici bir değer giriniz. 0 girilmesi halinde işlem sonucuna ulaşırsınız.");
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        int n1, n2, result = 0, i = 1;

            System.out.println("Çıkarma işlemi için iki sayı girilmelidir.");
            System.out.print(i++ + ". sayı :");
            n1 = scan.nextInt();
            System.out.print(i++ + ". sayı :");
            n2 = scan.nextInt();

            result = n1 - n2;

        System.out.println("Sonuç : " + result);
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Çapma işleminden çıkmak için 1'e basınız.");
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 1) {
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static  void divided(){
        Scanner scan = new Scanner(System.in);
        int sayi, number, i = 2;
        double result;

        System.out.println("Bölen sayının sıfır girilmesi halinde işlem sonucu yazdırılır.");
        System.out.print("Kaç adet sayı gireceksiniz: ");
        sayi = scan.nextInt();
        System.out.print("Bölünecek sayıyı giriniz: ");
        result = scan.nextDouble();

        while (sayi != 1) {
            sayi--;
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                //System.out.println("Bölen sayı 0 olamaz!");
                break;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void usluSsayi(){
        int n, r, toplam=1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı: ");
        n = inp.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        r = inp.nextInt();

        for (int i =1; i<=r; i++){
            toplam = toplam * n;
        }

        System.out.println("İşlem Sonucu: " + toplam);
    }

    static void factorial(){
        int n, toplam=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktöriyel hesabı yapılacak sayı: ");
        n = inp.nextInt();

        for (int i =2; i<=n; i++){
            toplam = toplam * i;
        }

        System.out.println("İşlem Sonucu: " + toplam);
    }

    static void mod(){
        int n, r, toplam;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı: ");
        n = inp.nextInt();
        System.out.print("Mod Olacak Sayı: ");
        r = inp.nextInt();

        toplam = n % r;

        System.out.println("İşlem Sonucu: " + toplam);
    }

    static void rectangle(){
        int kenar1, kenar2, cevre, alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenar: ");
        kenar1 = inp.nextInt();
        System.out.print("2. Kenar: ");
        kenar2 = inp.nextInt();

        cevre = 2 * (kenar1 + kenar2);
        alan = kenar1 * kenar2;

        System.out.println("Dikdörtgen Çevresi: " + cevre);
        System.out.println("Dikdörtgen alanı: " + alan);
    }

    public static void main(String[] args) {
        int select;
        boolean isLoading = true;

        while (isLoading) {
        Scanner scan = new Scanner(System.in);
            System.out.println();
        System.out.println(
                "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap");
        System.out.print("Hangi işlemi yapmak istediğinizi seçiniz: ");
        select = scan.nextInt();

            switch (select) {
                case 0 -> isLoading = false;
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> multiplication();
                case 4 -> divided();
                case 5 -> usluSsayi();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> rectangle();
                default -> System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
            }
        }
    }
}
