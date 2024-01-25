package com.enigma.java_collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
//        set tidak bisa menyimpan data dengan value yang sama
//        set berarti himpunan
        Set<String> names = new HashSet<>();
        names.add("Cahyo");
        names.add("Adil");
        names.add("Theo");
        names.add("Theo");
        names.add("Theo");
        names.add("BangYe");

//        dalam set data yang ditampilkan acak
//        set hanya bisa menyimpan data unik dan tidak bisa mengeditnya
        System.out.println(names);

        Hero cahyo = new Hero("Uzumaki Cahyo");
        Hero theo = new Hero("Uchiha Theo");
        Hero theo2 = new Hero("Uchiha Theo");
        Hero galih = new Hero("Hyuga Galih");

//        Set.of() -> fungsi yang dapat menyimpan data Set tetapi immutable
//        kalau memakai Set.of() apabila data yang benar - benar sama maka tidak bisa dipakai, apabila sudah terdapat equals dan hashcode
//        kalau belum ada equals dan hashcode maka akan terduplicate

//        Set<Hero> heroSet = Set.of(cahyo, theo, theo2, galih); // error karena terdapat equals dan hashcode
        Set<Hero> heroes = new HashSet<>();
        heroes.add(cahyo);
        heroes.add(theo2);
        heroes.add(theo2);
        heroes.add(galih);

//        System.out.println(heroSet);
        System.out.println(heroes);
    }

    public static class Hero {
        private String name;

        public Hero(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hero hero = (Hero) o;
            return Objects.equals(name, hero.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Hero{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
