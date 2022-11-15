import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik Notu : ");
        mat=inp.nextInt();

        System.out.print("Fizik Notu : ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notu : ");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notu : ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notu : ");
        tarih=inp.nextInt();

        System.out.print("Müzik Notu : ");
        muzik=inp.nextInt();

        double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.printf("Not Ortalaması: ",ort);

        String result= ort>=60? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(result);
    }
}
