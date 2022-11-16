import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int km, age, type;
        double total=0, result=0, yasIndirimi, normalTutar=0, yolIndirimi=0;

        Scanner klavye = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = klavye.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = klavye.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = klavye.nextInt();

        if (km > 0){
            if (age < 12) {
                    normalTutar += (0.10 * km);
                    yasIndirimi = (normalTutar * 0.50);
                    total = normalTutar - yasIndirimi;
                    if (type == 1) {
                        result =total * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else if (type == 2) {
                        yolIndirimi = total * 0.20;
                        result = (total - yolIndirimi) * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else {
                        System.out.println("Hatalı Veri Girdiniz !");
                    }
            }
            else if (age >= 12 && age <= 25) {
                    normalTutar += (0.10 * km);
                    yasIndirimi = (normalTutar * 0.10);
                    total = normalTutar - yasIndirimi;
                    if (type == 1) {
                        result =total * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else if (type == 2) {
                        yolIndirimi = total * 0.20;
                        result = (total - yolIndirimi) * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else {
                        System.out.println("Hatalı Veri Girdiniz !");
                    }
            }
            else if (age <= 64 && age >= 26) {
                normalTutar += (0.10 * km);
                total = normalTutar;
                if (type == 1) {
                    result =total;
                    System.out.println("Toplam Tutar: " + result);
                } else if (type == 2) {
                    yolIndirimi = total * 0.20;
                    result = (total - yolIndirimi) * 2;
                    System.out.println("Toplam Tutar: " + result);
                } else {
                    System.out.println("Hatalı Veri Girdiniz !");
                }
            }
            else if (age >= 65) {
                    normalTutar += (0.10 * km);
                    yasIndirimi = (normalTutar * 0.30);
                    total = normalTutar - yasIndirimi;
                    if (type == 1) {
                        result =total * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else if (type == 2) {
                        yolIndirimi = total * 0.20;
                        result = (total - yolIndirimi) * 2;
                        System.out.println("Toplam Tutar: " + result);
                    } else {
                        System.out.println("Hatalı Veri Girdiniz !");
                    }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
