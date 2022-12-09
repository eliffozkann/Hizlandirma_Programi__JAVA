package Diziler;

import java.util.Arrays;

public class ArraySinifiVeMetotlar {
    public static void main(String[] args){

        /* ******************* Arrays.toString() ************ */
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println("Arrays.toString() => " + Arrays.toString(dizi));
        // Çıktısı
        // [3, 5, 79, 12, 25, -3, 66, 82,-49,152]



        /* ******************* Arrays.fill() ************ */
        //Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.

        int[] listeFill = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(listeFill, 2);
        System.out.println("Arrays.fill() -tüm elemanlar iki yapıldı- => " + Arrays.toString(listeFill));

        int[] listeFill2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(listeFill2, 2, 9, 7);
        System.out.println("Arrays.fill() -2 ve 9 indekleri 7 yapıldı- => " + Arrays.toString(listeFill2));

        // Çıktısı
        // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
        // [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]




        /* ******************* Arrays.sort() ************ */
        //Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.

        int[] listeSort = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(listeSort);
        System.out.println("Arrays.sort() => " + Arrays.toString(listeSort));

        // Çıktısı
        // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]


        /* ******************* Arrays.binarySearch() ************ */
        //Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir.
        //Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.

        int[] listeSearch = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(listeSearch);
        System.out.println("Arrays.binarySearch() => " + Arrays.toString(listeSearch));

        int index = Arrays.binarySearch(listeSearch, 33);
        System.out.println("Arrays.binarySearch() => " + "33'ün indeksi :" + index);

        // [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
        // 33'ün indeksi :8



        /* ******************* Arrays.copyOf() ve Arrays.copyOfRange() metotu ************ */
        //Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        //Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.

        int[] listeCopy = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(listeCopy, 3);
        System.out.println("Arrays.copyOf() => " + Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(listeCopy, 0,5);
        System.out.println("Arrays.copyOfRange() => " + Arrays.toString(copyOfRangeArray));

        // [6, 1, 55]
        // [6, 1, 55, 21, 33]



        /* ******************* Arrays.equals()  ************ */
        //ava'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.
        int[] listEqu1 = {1, 2, 3};
        int[] listEqu2 = {1, 2, 3};
        int[] listEqu3 = {1, 2, 10};

        System.out.println("Arrays.equals() => " + Arrays.equals(listEqu1, listEqu2)); // true
        System.out.println("Arrays.equals() => " + Arrays.equals(listEqu2, listEqu3)); // false

    }
}
