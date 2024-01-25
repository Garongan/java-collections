package com.enigma.java_collections;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollection {
    public static void main(String[] args) {
        /*
        * method yang sering digunakan untuk collection
        * 1. add() -> menambah data sesuai tipe data
        * 2. remove() -> menghapus data, berdasarkan value
        * 3. contains() -> digunnaka apakah data mengandung data yang dicari
        *
        * */

        Collection<String> names = new ArrayList<>();
        names.add("Cahyo");
        names.add("Theo");
        names.add("Saipul");
        names.add("Alvindo");

        names.remove("Theo");

        System.out.println(names);
//        method contains melakukan pengecekan secara strict untuk case nya
//        kalau mau check dengan mengabaikan case pakai method sendiri
        System.out.println(names.contains("Cahyo"));

//        example cari dengan mengabaikan case
        for (String name : names) {
            if (name.equalsIgnoreCase("cahyo")) System.out.println("ada");
        }

//        addAll
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Jambu");
        fruits.add("Jambu Mente");

        names.addAll(fruits);

        System.out.println(names);
    }
}
