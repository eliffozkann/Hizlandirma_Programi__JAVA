
import java.util.*;

//9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

public class Fibonacci {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci Serisinin Eleman Sayısı: ");
        int number = inp.nextInt();

        int[] feb = new int[number];
        feb[0] = 0;
        feb[1] = 1;
        for(int i=2; i < number; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< number; i++){
            System.out.print(feb[i] + " ");
        }

    }
}
