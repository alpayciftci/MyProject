package myPackage2;

public class AsalSayi {
    /*36-----
    Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.

    Test Data:

    isPrime(31)
    true

    isPrime(18)
    false
    */

        public static void main(String[] args) {
            int number = 31;
            boolean isPrime = isPrime(number);
            System.out.println(number + " is prime: " + isPrime);
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
