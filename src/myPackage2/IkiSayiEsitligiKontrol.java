package myPackage2;

public class IkiSayiEsitligiKontrol {
    /*----
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 20;

        System.out.println((IsEqual(num1, num2)));

    }

    private static boolean IsEqual(int num1, int num2) {

        return num1 == num2;
    }
}
