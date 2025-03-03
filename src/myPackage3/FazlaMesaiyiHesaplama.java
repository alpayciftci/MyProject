package myPackage3;

import java.util.Scanner;

public class FazlaMesaiyiHesaplama {
    /*49-----
    Fazla mesaiyi hesaplayan bir program yazınız.
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saatlik Calisma Ucreti...?");
        double ucret = scanner.nextDouble();
        System.out.println("Baslama Saati...?");
        double start = scanner.nextDouble();
        System.out.println("Bitis Saati...?");
        double finish = scanner.nextDouble();
        System.out.println("Mesai Carpani...?");
        double mesai = scanner.nextDouble();

        double toplam = ucretHesapla(start, finish, ucret, mesai);
        System.out.println(toplam);
    }
    public static double ucretHesapla (double start, double finish, double ucret, double mesai){

        return ucret * (finish-start) + ucret * (mesai-1) * (finish-17);
    }
}
