package com.example.ArrayUni;

public class Main {

    /**
     *
     * Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     */
    public static void main(String[] args) {

        String[] names ={"Hector", "Lia", "China", "Gilly"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}
