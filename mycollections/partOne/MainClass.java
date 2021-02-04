package com.nzavod.mycollections.partOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        ILinkedList<String> myLinkedList = new MyLinkedList<>();
        String s = "Kola";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Выберите операцию:");
            System.out.println("1 Add String");
            System.out.println("2 Add in index position");
            System.out.println("3 Remove by String");
            System.out.println("4 Index of String");
            System.out.println("5 Set element in index position");
            System.out.println("6 Clear list");
            System.out.println("7 Show size of List");
            System.out.println(" Other exit");
            int variant = Integer.parseInt(reader.readLine());
            if (variant == 1){
                System.out.println("Введите:");
                String s1  = reader.readLine();
                myLinkedList.add(s1);
                System.out.println(myLinkedList);
            }
            else if (variant == 2){
                System.out.println("Введите индекс");
                int index = Integer.parseInt(reader.readLine());
                System.out.println("Введите элемент");
                String element = reader.readLine();
                myLinkedList.add(index, element);
                System.out.println(myLinkedList);

            }
            else if (variant == 3){
                System.out.println("Введите индекс");
                int index = Integer.parseInt(reader.readLine());
                myLinkedList.remove(index);
                System.out.println(myLinkedList);
            }
            else if (variant == 4){
                System.out.println("Введите элеменрт");
                String element = reader.readLine();
                System.out.println(myLinkedList.indexOf(element));
                System.out.println(myLinkedList);
            }
            else if (variant == 5){
                System.out.println("Введите индекс");
                int index = Integer.parseInt(reader.readLine());
                System.out.println("Введите элеменрт");
                String element = reader.readLine();
                myLinkedList.set(index, element);
                System.out.println(myLinkedList);
            }
            else if (variant == 6){
                myLinkedList.clear();
            }
            else if (variant == 7){
                System.out.println(myLinkedList.size());
            }
            else {
                break;
            }

        }

        myLinkedList.clear();
        for (int i = 0; i < 10; i ++){
            myLinkedList.add(s + i);
        }
        String[]arr = myLinkedList.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String ss : myLinkedList){
            System.out.println(ss);
        }













    }

    }


