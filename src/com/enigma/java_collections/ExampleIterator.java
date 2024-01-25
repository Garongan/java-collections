package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args) {
//        generic -> jika suatu class/interface yang memiliki generic harus ditentukan tipe datanya di awal
//        generic harus diisi dengan tipe data non-primitive
//        default ArrayList adalah 10
//        diatas java 8 pakaj List.of();
//        java 8 kebawah -> Arrays.asList();
        Iterable<String> names = new ArrayList<>(Arrays.asList("Cahyo", "Theo", "Rahman", "Alvindo", "Dzaki"));

//        lihat data cara lama
        Iterator<String> iterator = names.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println("===hasil lihat cara baru===");

//        lihat data cara baru
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("=======remove=========");
//        hapus data cara lama
        while (iterator.hasNext()) {
            if (iterator.next().equals("Alvindo")) iterator.remove();
        }

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.spliterator());
    }
}
