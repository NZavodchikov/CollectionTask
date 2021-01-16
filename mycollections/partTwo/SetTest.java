package com.nzavod.mycollections.partTwo;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    private static Set<String> hashSet = new HashSet<>();
    private static Set<String> linkedHashSet = new LinkedHashSet<>();
    private static Set<String> treeSet = new TreeSet<>();

    private static String s = "Kola";

    public static void initSet(){
        System.out.println("Добавление в HashSet, LinkedHashSet и TreeSet 100 000 элементов");
        System.out.println();

        System.out.println("Добавление в HashSet");
        long setTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            hashSet.add(s + i);
        }
        System.out.println(System.nanoTime() - setTime1);
        System.out.println();

        System.out.println("Добавление в LinkedHashSet");
        long setTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedHashSet.add(s + i);
        }
        System.out.println(System.nanoTime() - setTime2);
        System.out.println();

        System.out.println("Добавление в TreeSet");
        long setTime3 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            treeSet.add(s + i);
        }
        System.out.println(System.nanoTime() - setTime3);
        System.out.println();
    }
    public static void containsInSet(){
        System.out.println("Проверка содержания элемента в HashSet, LinkedHashSet и TreeSet");
        System.out.println();

        System.out.println("Проверка содержания в HashSet:");
        long setTime1 = System.nanoTime();
        boolean contains1 = hashSet.contains("Kola88888");
        System.out.println(System.nanoTime() - setTime1);
        System.out.println();

        System.out.println("Проверка содержания в LinkedHashSet:");
        long setTime2 = System.nanoTime();
        boolean contains2 = linkedHashSet.contains("Kola88888");
        System.out.println(System.nanoTime() - setTime2);

        System.out.println("Проверка содержания в TreeSet:");
        long setTime3 = System.nanoTime();
        boolean contains3 = treeSet.contains("Kola88888");
        System.out.println(System.nanoTime() - setTime3);
    }
    public static void removeFromSet(){
        System.out.println("Удаление из HashSet, LinkedHashSet и TreeSet 100 000 элементов");
        System.out.println();

        System.out.println("Удаление из HashSet:");
        long setTime4 = System.nanoTime();
        hashSet.remove("Kola88888");
        System.out.println(System.nanoTime()-setTime4);
        System.out.println();

        System.out.println("Удаление из LinkedHashSet:");
        long setTime5 = System.nanoTime();
        linkedHashSet.remove("Kola88888");
        System.out.println(System.nanoTime()-setTime5);
        System.out.println();

        System.out.println("Удаление из TreeSet:");
        long setTime6 = System.nanoTime();
        treeSet.remove("Kola88888");
        System.out.println(System.nanoTime()-setTime6);
        System.out.println();
    }
}
