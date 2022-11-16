import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("1. Ocak\n2. Şubat\n3. Mart\n4. Nisan\n5. Mayıs\n6. Haziran\n7. Temmuz\n8. Ağustos\n9. Eylül\n10. Ekim\n11. Kasım\n12. Aralık");
        System.out.print("Doğduğunuz ayın numarasını giriniz: ");
        int month = inp.nextInt();

        System.out.print("Doğduğunuz gün: ");
        int day = inp.nextInt();

        if (month == 1){
            if (day >= 1 && day <= 21) {
                System.out.println("Oğlak");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Kova");
            }
        }
        if (month == 2){
            if (day >= 1 && day <= 19) {
                System.out.println("Kova");
            } else if (day >= 20 && day <= 28) {
                System.out.println("Balık");
            }
        }
        if (month == 3){
            if (day >= 1 && day <= 20) {
                System.out.println("Balık");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Koç");
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("Koç");
            } else if (day >= 21 && day <= 30) {
                System.out.println("Boğa");
            }
        }
        if (month == 5){
            if (day >= 1 && day <= 21) {
                System.out.println("Boğa");
            } else if (day >= 22 && day <= 31) {
                System.out.println("İkizler");
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.println("İkizler");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Yengeç");
            }
        }
        if (month == 7){
            if (day >= 1 && day <= 22) {
                System.out.println("Yengeç");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Aslan");
            }
        }
        if (month == 8){
            if (day >= 1 && day <= 22) {
                System.out.println("Aslan");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Başak");
            }
        }
        if (month == 9){
            if (day >= 1 && day <= 22) {
                System.out.println("Başak");
            } else if (day >= 23 && day <= 30) {
                System.out.println("Terazi");
            }
        }
        if (month == 10){
            if (day >= 1 && day <= 22) {
                System.out.println("Terazi");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Akrep");
            }
        }
        if (month == 11){
            if (day >= 1 && day <= 21) {
                System.out.println("Akrep");
            } else if (day >= 22 && day <= 30) {
                System.out.println("Yay");
            }
        }
        if (month == 12){
            if (day >= 1 && day <= 21) {
                System.out.println("Yay");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Oğlak");
            }
        }
    }
}
