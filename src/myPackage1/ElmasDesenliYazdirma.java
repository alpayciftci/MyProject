package myPackage1;

public class ElmasDesenliYazdirma {
    public static void main(String[] args) {

        /*-----
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
    */
        int n = 7; // Yarim elmas uzunluğu
        // Üst yari
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt yari
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int uzunluk = 7;
        System.out.println(" _____________2. Yol_____________ ");
        drawDiamond(uzunluk);

    }
                   // 2.yol
    public static void drawDiamond(int uzunluk) {
        for (int i = 1; i <= uzunluk * 2 - 1; i++) {
            int spaces = Math.abs(uzunluk - i);
            int stars = uzunluk * 2 - 1 - 2 * spaces;

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

