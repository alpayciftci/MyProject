package myPackage2;

public class ArraydekiSayilarinOrtalamasiniBulma {
    /*----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7.0
    */
    public static void main(String[] args) {

        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double average = 0;
        double total = 0;

        for (int num : numbers) {
            total += num;
        }
        average = total / numbers.length;
        System.out.println("Average is: " + average);

    }
}
