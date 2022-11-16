import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        int kg;
        double m;
        double index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        m = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = inp.nextInt();

        index = kg / ( m * m );
        System.out.println("Vücut Kitle İndeksiniz: " + index);
    }
}
