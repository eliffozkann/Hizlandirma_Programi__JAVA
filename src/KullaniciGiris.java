import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = inp.nextLine();
        System.out.print("Şifre: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Bilgileriniz Yanlış!!");
            System.out.println("Şifrenizin Sıfırlanmasını İstiyor Musunuz?\n1. Evet\n2. Hayır");
            System.out.print("Yapmak istediğiniz işlem numarası: ");
            select = inp.nextInt();


            if (select == 1) {

                System.out.print("Yeni şifrenizi Giriniz: ");
                newPassword = inp.nextLine();
                if (newPassword != password) {
                    System.out.println("Şifre Oluşturuldu.");
                } else {
                    System.out.println("Yeni şifreniz eski şifre ile aynı olamaz! Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else if (select == 2) {
                System.out.println("Hayır seçildi.");
            } else {
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
            }

        }


    }
}
