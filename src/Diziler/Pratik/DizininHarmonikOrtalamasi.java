package Diziler.Pratik;

public class DizininHarmonikOrtalamasi {
    public static void main(String[] args) {

        int[] list = {1, 5, 6, 8, 7, 10, 20, 36, 56, 94, 17};
        double sum = 0.0;
        for (int j : list) {
            sum += (1.0 / j);
        }

        double avarage = list.length / sum;
        System.out.println(avarage);
    }
}
