package myPackage2;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sil {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(4);
        list.add(6);
        for (Integer v: list) {
            System.out.println(v);
        }
        System.out.println(list.get(1));
        System.out.println(Integer.parseInt("934"));
        System.out.println(Integer.valueOf ("3434"));

    }
}
