package myPackage5;

import java.util.PriorityQueue;

public class PriorityQueueElemanlariniYazdirma {
    /*68-----
    Bir Priority Queue  oluşruralım, elemanlarını ekleyip
    priority queue yazdıralım.

    priority queue elemanları: sari,yesil,mavi,kirmizi

    Beklenen Çıktı:
    Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
    */
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("sari");
        priorityQueue.add("yesil");
        priorityQueue.add("mavi");
        priorityQueue.add("kirmizi");

        System.out.println("Priority queue elemanlari: " + priorityQueue);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
        System.out.println(priorityQueue);
    }
}
