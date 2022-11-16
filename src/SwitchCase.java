import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
        n1 = inp.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        System.out.print("Yapmak istediğiniz işlem numarası: ");
        select = inp.nextInt();


        switch(select)
        {
            case 1: System.out.println("Toplama Sonucu:" + (n1 + n2));break;
            case 2: System.out.println("Çıkartma Sonucu:" + (n1 - n2));break;
            case 3: System.out.println("Çarpma Sonucu:" + (n1 * n2));break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme Sonucu:" + (n1 / n2));
                } else {
                    System.out.println("Herhangi bir sayı 0'a bölünemez!!");
                };break;
            default: System.out.println("Yanlış nir seçim yaptınız. Tekrar deneyiniz.");
        }
    }
}
