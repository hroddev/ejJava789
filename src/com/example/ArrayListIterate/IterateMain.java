package com.example.ArrayListIterate;

import java.util.ArrayList;
import java.util.LinkedList;

public class IterateMain {

    /**
     * Crea un ArrayList de tipo String, con 4 elementos.
     * Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hector");
        list.add("Lia");
        list.add("Gilly");
        list.add("Karo");

        for (String name: list
             ) {
            System.out.println(name);
        }

        LinkedList<String> copyList = new LinkedList<>();

        for (String insert: list
             ) {
            copyList.add(insert);
        }

        for (String linked: copyList
             ) {
            System.out.println(linked);
        }

    }
}
