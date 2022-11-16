import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        int toplam=0, counter=0;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        mat=inp.nextInt();
        if (mat<= 100 && mat > 0) {
            toplam += mat;
            counter++;
        } else { System.out.println("Matematik notu 0 ve 100 arasında olmadığı için ortalamaya dahil edilmedi.");}

        System.out.print("Fizik Notu : ");
        fizik=inp.nextInt();
        if (fizik<= 100 && fizik > 0) {
            toplam += fizik;
            counter++;
        }else { System.out.println("Fizik notu 0 ve 100 arasında olmadığı için ortalamaya dahil edilmedi.");}

        System.out.print("Kimya Notu : ");
        kimya=inp.nextInt();
        if (kimya<= 100 && kimya > 0) {
            toplam += kimya;
            counter++;
        } else { System.out.println("Kimya notu 0 ve 100 arasında olmadığı için ortalamaya dahil edilmedi.");}

        System.out.print("Türkçe Notu : ");
        turkce=inp.nextInt();
        if (turkce<= 100 && turkce > 0) {
            toplam += turkce;
            counter++;
        } else { System.out.println("Türkçe notu 0 ve 100 arasında olmadığı için ortalamaya dahil edilmedi.");}

        System.out.print("Müzik Notu : ");
        muzik=inp.nextInt();
        if (muzik<= 100 && muzik > 0) {
            toplam += muzik;
            counter++;
        } else { System.out.println("Müzik notu 0 ve 100 arasında olmadığı için ortalamaya dahil edilmedi.");}


        double ort=toplam/counter;

        System.out.println("Not Ortalaması: " + ort);

        String result= ort >= 55 ? "Sınıfı Geçti" :"Sınıfta Kaldı";
        System.out.println(result);
    }
}
