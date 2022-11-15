import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        //System.out.println("Hello World");
        //System.out.println(" World");
        //System.out.println("*\n**\n***");

        int a;
        System.out.print("Integer bir değer giriniz: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(a);

        //String şeklinde değer almak için
        Scanner deger = new Scanner(System.in);
        System.out.print("String bir değer giriniz: ");
        String str = deger.nextLine();
        System.out.println(str);
    }
}