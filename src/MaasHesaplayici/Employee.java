package MaasHesaplayici;

public class Employee {
        String name;
        double salary;
        int workHours;
        int hireYear;

        Employee(String name, double salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        double tax(){
            if (salary < 100){
                return 0;
            } else {
                return (salary*3.0) / 100;
            }
        }

        double bonus(){
            if(workHours > 40){
                return (workHours - 40) * 30;
            } else {
                return 0;
            }
        }

    double raiseSalary(){
            int kacYil = 2021 - hireYear;
            if (kacYil < 9){
                return (salary * 5.0) / 100;
            } else if (kacYil >= 10 && kacYil < 20){
                return (salary * 10.0) / 100;
            } else {
                return (salary * 15.0) / 100;
            }
    }

    void tooString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Haftalık Çalışma Saati : "+this.workHours);
        System.out.println("İşe Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + ((this.salary - tax()) + bonus()) );
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()) );
    }


/*
Sınıfın Metotları

        + Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
        + tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
        + Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        + Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
        + bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        + raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        + Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        + Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        + Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        + toString() : Çalışana ait bilgileri ekrana bastıracaktır.

*/

}

