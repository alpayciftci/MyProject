package myPackage2;

public class SekilliYazdirma {
    /*----
    Aşağıdaki grid şeklini yazan Java Kodunu yazınız.

    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
    */

    public static void main(String[] args) {

        // Define the number of rows and columns
        int rows = 10;
        int columns = 10;

                // Loop through each row
                for (int i = 0; i < rows; i++) {
                    // Loop through each column in the current row
                    for (int j = 0; j < columns; j++) {
                        // Print "0" with a space, without moving to the next line
                        System.out.print("0  ");
                    }
                    // Move to the next line after printing all columns in the current row
                    System.out.println();
                }
    }
}