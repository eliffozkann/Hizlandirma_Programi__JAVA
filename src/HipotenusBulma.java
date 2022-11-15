import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        int a, b;
        double c;
        double u;
        Scanner inp=new Scanner(System.in);
        System.out.print("Üçgenin birinci kenarı: ");
        a = inp.nextInt();
        System.out.print("Üçgenin ikinci kenarı: ");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs kenarı: " + c);

        u = (a+b+c) / 2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
