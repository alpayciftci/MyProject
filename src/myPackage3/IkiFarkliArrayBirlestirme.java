package myPackage3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IkiFarkliArrayBirlestirme {
    /*48-----
    İki farklı Array'i birleştiren bir program yazınız.

    Örnekler:

    birlestir([1, 3, 5], [2, 6, 8])
    Çıktı : [1, 3, 5, 2, 6, 8]

    birlestir([7, 8], [10, 9, 1, 1, 2])
    Çıktı : [7, 8, 10, 9, 1, 1, 2]

    birlestir([4, 5, 1], [3, 3, 3, 3, 3])
    Çıktı : [4, 5, 1, 3, 3, 3, 3, 3]
    */
    public static void main(String[] args) {
       int[] arr1 = birlestir(new int[]{1, 3, 5}, new int[]{2, 6, 8});
       int[] arr2 = combineWithLoop(new int[]{7, 8}, new int[]{10, 9, 1, 1, 2});
       List<Integer> list1 = combinewithList (new Integer[]{4, 5, 1}, new Integer[]{3, 3, 3, 3, 3});

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(list1);
    }
    public static int[] birlestir(int[] a, int[] b){
        int[] newarray = new int[a.length + b.length];
        System.arraycopy(a, 0, newarray, 0, a.length);
        System.arraycopy(b, 0, newarray, a.length, b.length);
        return newarray;
    }
    public static int[] combineWithLoop(int[] a, int[] b){
        int[] newarray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newarray[i] = a[i];
        }
        for (int i = 0; i < b.length ; i++) {
            newarray[i+a.length] = b[i];
        }
        return newarray;
    }

    public static List<Integer> combinewithList (Integer [] a, Integer[] b ){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(b));

        list1.addAll(list2);
        return list1;
    }
}
