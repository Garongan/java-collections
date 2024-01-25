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

        Iterator<String> iterator = names.iterator();

        System.out.println(iterator.next());
    }
}
