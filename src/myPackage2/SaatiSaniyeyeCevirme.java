package myPackage2;

public class SaatiSaniyeyeCevirme {
    public static void main(String[] args) {
        /*----
    Saati saniyeye çeviren java methodunu yazınız.

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        System.out.println( howManySeconds (2));

    }
    public static int howManySeconds(int hour) {

        return hour*3600;
    }
}
