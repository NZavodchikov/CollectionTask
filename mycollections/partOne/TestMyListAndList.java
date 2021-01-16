package com.nzavod.mycollections.partOne;

import java.util.LinkedList;
import java.util.List;

public class TestMyListAndList {
    public static void main(String[] args) {
        ILinkedList<String> myLinkedList = new MyLinkedList<>();
        List<String> linkedList = new LinkedList<>();
        String s = "Kola";

        long time = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            myLinkedList.add(s + i);
        }
        System.out.println("Добавление в MyLinkedList:");
        System.out.println(System.nanoTime()-time);

        long time1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedList.add(s + i);
        }
        System.out.println("Добавление в LinkedList:");
        System.out.println(System.nanoTime()-time1);

        long time2 = System.nanoTime();
        String name = myLinkedList.get(88888);
        System.out.println("Поиск в MyLinkedList");
        System.out.println(System.nanoTime() - time2);

        long time3 = System.nanoTime();
        String name1 = linkedList.get(88888);
        System.out.println("Поиск в LinkedList");
        System.out.println(System.nanoTime() - time3);

        long time4 = System.nanoTime();
        String name2 = myLinkedList.remove(88888);
        System.out.println("Удаление в MyLinkedList");
        System.out.println(System.nanoTime() - time4);

        long time5 = System.nanoTime();
        String name3 = linkedList.remove(88888);
        System.out.println("Удаление в LinkedList");
        System.out.println(System.nanoTime() - time5);
    }
}
