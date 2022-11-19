import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {


        int ebob=0, ekok=0, small;

        Scanner input = new Scanner (System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2=input.nextInt();

        small = Math.min(n1, n2);

        //EBOB
        while( small >= 1 ){
           small--;
           if (n1 % small == 0 && n2 % small == 0){
               ebob = small;
               break;
           }
        }

        int i = (n1 * n2);
        while( i >= 1){
            i--;
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
        }

        System.out.println("Sayıların EBOB'u: " + ebob);
        System.out.println("Sayıların EKOK'u: " + ekok);

    }

}
