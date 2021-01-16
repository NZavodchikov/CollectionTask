package com.nzavod.mycollections.partTwo;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Test for List");
        ListTest.initList();
        ListTest.searchInList();
        ListTest.removeFromList();

        System.out.println("Test for Set");
        SetTest.initSet();
        SetTest.containsInSet();
        SetTest.removeFromSet();

        System.out.println("Test for Map");
        MapTest.initMap();
        MapTest.containsInMap();
        MapTest.removeFromMap();
    }

}
