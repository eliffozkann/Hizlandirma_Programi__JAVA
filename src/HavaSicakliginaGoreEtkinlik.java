import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık Değeri: ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if (heat < 15 && heat >= 5) {
            System.out.println("Sinemaya gidilebilir.");
        }
        else if (heat >= 15 && heat < 25) {
            System.out.println("Pikniğe gidilebilir.");
        }
        else if (heat >= 25) {
            System.out.println("Yüzmeye gidilebilir.");
        }
    }
}
