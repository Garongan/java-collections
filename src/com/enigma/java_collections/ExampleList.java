package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        /*
         * List
         * 1. get -> grab the value by index
         * 2. set(int index, Object element) -> change the value by index
         *
         * */
        List<String> names = new ArrayList<>();
        names.add("Budi");
        names.add("Cahyo");
        names.add("Alvindo");
        names.add("Adil");
        names.add("Theo");

//        grab the value
        System.out.println(names.get(2));

//        change the value
        names.set(0, "Saipul");
        System.out.println(names);

        List<String> names2 = new LinkedList<>();

        printList(names);
        printList(names2);

//        pakai for i
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

//        pakai for each
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void printList(List<String> list) {
        System.out.println(list);
    }
}
