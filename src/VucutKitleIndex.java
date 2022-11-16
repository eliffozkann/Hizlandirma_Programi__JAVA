import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        double A = 2.14, E = 3.67, D = 1.11, M = 0.95, P = 5.00;
        double Armut, Elma, Domates, Muz, Patlican;
        double total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?: ");
        Armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ?: ");
        Elma = inp.nextInt();
        System.out.print("Domates Kaç Kilo ?: ");
        Domates = inp.nextInt();
        System.out.print("Muz Kaç Kilo ?: ");
        Muz = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ?: ");
        Patlican = inp.nextInt();

        total = (A*Armut) + (E*Elma) + (D*Domates) + (M*Muz) + (P*Patlican);
        System.out.println("Toplam Tutar: " + total);
    }
}
