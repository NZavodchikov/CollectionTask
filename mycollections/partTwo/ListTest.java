package com.nzavod.mycollections.partTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    private static List<String> arrayList = new ArrayList<>();
    private static List<String> linkedList = new LinkedList<>();
    private static String s = "Kola";

    public static void initList(){
        System.out.println("Добавление в ArrayList и LinkedList 100 000 элементов");
        System.out.println();

        System.out.println("Добавление в ArrayList:");

        long time = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            arrayList.add(s + i);
        }
        System.out.println(System.nanoTime()-time);
        System.out.println();

        System.out.println("Добавление в LinkedList:");

        long time1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedList.add(s + i);
        }
        System.out.println(System.nanoTime()-time1);
    }
    public static void searchInList(){
        System.out.println("Поиск по индексу в ArrayList и LinkedList:");
        System.out.println();

        System.out.println("Поиск в ArrayList:");

        long time2 = System.nanoTime();
        String name = arrayList.get(88888);
        System.out.println(System.nanoTime() - time2);
        System.out.println();

        System.out.println("Поиск в LinkedList");

        long time3 = System.nanoTime();
        String name1 = linkedList.get(88888);
        System.out.println(System.nanoTime() - time3);
        System.out.println();
    }
    public static void removeFromList(){
        System.out.println("Удаление по индексу в ArrayList и LinkedList:");
        System.out.println();

        System.out.println("Удаление в ArrayList");
        long time4 = System.nanoTime();
        String name2 = arrayList.remove(88888);
        System.out.println(System.nanoTime() - time4);
        System.out.println();

        System.out.println("Удаление в LinkedList");
        long time5 = System.nanoTime();
        String name3 = linkedList.remove(88888);
        System.out.println(System.nanoTime() - time5);
        System.out.println();
    }
}
