import java.util.Scanner;

public class TaksimetreProgrami {
    //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
    //Taksimetre KM başına 2.20 TL tutmaktadır.
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    //Taksimetre açılış ücreti 10 TL'dir.

    public static void main(String[] args) {
        int km;
        double perKm=2.20, total=10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = inp.nextInt();

        total += (km * perKm);
        double result = (total <= 20) ? (result=20) : (result =total);
        System.out.println("Taksimetre Ücreti: " + result);

    }
}
