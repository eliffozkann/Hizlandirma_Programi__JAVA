import java.util.Scanner;

public class DaireninAlaniCevresi {
    //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    //Alan Formülü : π * r * r;
    //Çevre Formülü : 2 * π * r;
    //Ödev
    //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    //𝜋 sayısını = 3.14 alınız.
    //Formül : (𝜋 * (r*r) * 𝛼) / 360

    public static void main(String[] args) {
        double pi = 3.14;
        int r, aci;
        double alan, cevre, dilimAlan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapı: ");
        r = inp.nextInt();
        System.out.print("Dilim dairenin açısı: ");
        aci = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        dilimAlan = (pi * (r *r) * aci)/360;
        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dilim Dairenin Alanı: " + dilimAlan);
    }
}
