package com.nzavod.mycollections.partTwo;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    private static Map<Integer, String> hashMap = new HashMap<>();
    private static Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    private static Map<Integer, String> treeMap = new TreeMap<>();
    private static String s = "Kola";

    public static void initMap() {
        System.out.println("Добавление в HashMap, LinkedHashMap и TreeMap 100 000 элементов");
        System.out.println();

        System.out.println("Добавление в HashMap");
        long mapTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            hashMap.put(i, s + i);
        }
        System.out.println(System.nanoTime() - mapTime1);
        System.out.println();

        System.out.println("Добавление в LinkedHashMap");
        long mapTime2 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedHashMap.put(i, s + i);
        }
        System.out.println(System.nanoTime() - mapTime2);
        System.out.println();

        System.out.println("Добавление в TreeMap");
        long mapTime3 = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            treeMap.put(i, s + i);
        }
        System.out.println(System.nanoTime() - mapTime3);
    }
    public static void  containsInMap(){
        System.out.println("Проверка содержания элемента по значению в HashMap, LinkedHashMap и TreeMap");
        System.out.println();

        System.out.println("Содержание элемента по значению в HashMap:");
        long mapTime4 = System.nanoTime();
        boolean contains1 = hashMap.containsValue("Kola88888");
        System.out.println(System.nanoTime()-mapTime4);
        System.out.println();

        System.out.println("Содержание элемента по значению в LinkedHashMap:");
        long mapTime5 = System.nanoTime();
        linkedHashMap.containsValue("Kola88888");
        System.out.println(System.nanoTime()-mapTime5);
        System.out.println();

        System.out.println("Содержание элемента по значению в TreeMap:");
        long mapTime6 = System.nanoTime();
        treeMap.containsValue("Kola88888");
        System.out.println(System.nanoTime()-mapTime6);
        System.out.println();



    }

    public static void removeFromMap(){
        System.out.println("Удаление в HashMap, LinkedHashMap и TreeMap 100 000 элементов");
        System.out.println();

        System.out.println("Удаление из HashMap:");
        long mapTime4 = System.nanoTime();
        hashMap.remove(88888);
        System.out.println(System.nanoTime()-mapTime4);
        System.out.println();

        System.out.println("Удаление из LinkedHashMap:");
        long mapTime5 = System.nanoTime();
        linkedHashMap.remove(88888);
        System.out.println(System.nanoTime()-mapTime5);
        System.out.println();

        System.out.println("Удаление из TreeMap:");
        long mapTime6 = System.nanoTime();
        treeMap.remove(88888);
        System.out.println(System.nanoTime()-mapTime6);
        System.out.println();

    }
}
