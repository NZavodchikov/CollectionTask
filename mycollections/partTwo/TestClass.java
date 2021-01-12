package com.nzavod.mycollections.partTwo;


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestClass {
    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        String s = "Kola";

        System.out.println("ArrayList and LinkedList");

        long time = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            arrayList.add(s + i);
        }
        System.out.println("Добавление в ArrayList:");
        System.out.println(System.nanoTime()-time);
        long time1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedList.add(s + i);
        }
        System.out.println("Добавление в LinkedList:");
        System.out.println(System.nanoTime()-time1);


        long time2 = System.nanoTime();
        String name = arrayList.get(88888);
        System.out.println("Поиск в ArrayList");
        System.out.println(System.nanoTime() - time2);

        long time3 = System.nanoTime();
        String name1 = linkedList.get(88888);
        System.out.println("Поиск в LinkedList");
        System.out.println(System.nanoTime() - time3);

        long time4 = System.nanoTime();
        String name2 = arrayList.remove(88888);
        System.out.println("Удаление в ArrayList");
        System.out.println(System.nanoTime() - time4);

        long time5 = System.nanoTime();
        String name3 = linkedList.remove(88888);
        System.out.println("Удаление в LinkedList");
        System.out.println(System.nanoTime() - time5);

        System.out.println("HashSet and LinkedHashSet and TreeSet");

        long setTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            hashSet.add(s + i);
        }
        System.out.println("Добавление в HashSet");
        System.out.println(System.nanoTime() - setTime1);

        long setTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedHashSet.add(s + i);
        }
        System.out.println("Добавление в LinkedHashSet");
        System.out.println(System.nanoTime() - setTime2);

        long setTime3 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            treeSet.add(s + i);
        }
        System.out.println("Добавление в TreeSet");
        System.out.println(System.nanoTime() - setTime3);

        long setTime4 = System.nanoTime();
        hashSet.remove("Kola88888");
        System.out.println("Удаление из HashSet:");
        System.out.println(System.nanoTime()-setTime4);

        long setTime5 = System.nanoTime();
        linkedHashSet.remove("Kola88888");
        System.out.println("Удаление из LinkedHashSet:");
        System.out.println(System.nanoTime()-setTime5);

        long setTime6 = System.nanoTime();
        treeSet.remove("Kola88888");
        System.out.println("Удаление из TreeSet:");
        System.out.println(System.nanoTime()-setTime6);

        System.out.println("HashMap and LinkedHashMap and TreeMap");

        long mapTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            hashMap.put(i, s + i);
        }
        System.out.println("Добавление в HashMap");
        System.out.println(System.nanoTime() - mapTime1);

        long mapTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedHashMap.put(i, s + i);
        }
        System.out.println("Добавление в LinkedHashMap");
        System.out.println(System.nanoTime() - mapTime2);

        long mapTime3 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            treeMap.put(i, s + i);
        }
        System.out.println("Добавление в TreeMap");
        System.out.println(System.nanoTime() - mapTime3);

        long mapTime4 = System.nanoTime();
        hashMap.remove(88888);
        System.out.println("Удаление из HashMap:");
        System.out.println(System.nanoTime()-mapTime4);

        long mapTime5 = System.nanoTime();
        linkedHashMap.remove(88888);
        System.out.println("Удаление из LinkedHashMap:");
        System.out.println(System.nanoTime()-mapTime5);

        long mapTime6 = System.nanoTime();
        treeMap.remove(88888);
        System.out.println("Удаление из TreeMap:");
        System.out.println(System.nanoTime()-mapTime6);










    }

}
