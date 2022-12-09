package Diziler.Pratik;

public class DiziElemanlarininOrtalamasi {
    public static void main(String[] args) {

        int[] list = {1, 5, 6, 8, 7, 10, 20, 36, 56, 94, 17};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        double avarage = sum / list.length;
        System.out.println(avarage);
    }

}
