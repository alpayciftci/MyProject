package myPackage1;

public class ReplaceAll {
    public static void main(String[] args) {

        String original = "The quick brown fox jumps over the lazy dog";
        String replaced = original.replaceAll("[aeiou]", "*");
        System.out.println(replaced);  // Output: Th* q**ck br*wn f*x j*mps *v*r th* l*zy d*g

        String original1 = "www.example.com";
        String replaced1 = original1.replaceAll("\\.", "-");
        System.out.println(replaced1);  // Output: www-example-com

    }
}
