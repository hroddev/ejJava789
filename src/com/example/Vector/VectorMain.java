package com.example.Vector;

import java.util.Vector;

public class VectorMain {
    /**
     * Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
     * Elimina el 2o y 3er elemento y muestra el resultado final.
     *
     */
    public static void main(String[] args) {
        Vector<Integer> vectorOne;
        vectorOne = new Vector<>();
        vectorOne.add(2);
        vectorOne.add(22);
        vectorOne.add(45);
        vectorOne.add(12);
        vectorOne.add(49);

        System.out.println(vectorOne);
        vectorOne.remove(1);
        vectorOne.remove(2);
        System.out.println(vectorOne);
    }
}
