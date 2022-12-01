package com.example.ArrayListConditional;

import java.util.ArrayList;

public class ArrayParMain {

    /**
     * Crea un ArrayList de tipo int, y, utilizando un bucle
     * rellénalo con elementos 1..10. A continuación, con otro bucle,
     * recórrelo y elimina los numeros pares. Por último, vuelve a
     * recorrerlo y muestra el ArrayList final. Si te atreves,
     * puedes hacerlo en menos pasos, siempre y cuando cumplas
     * el primer "for" de relleno.
     *
     */
    public static void main(String[] args) {

        ArrayList<Integer> listNumber = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            listNumber.add(i);
        }
        System.out.println(listNumber);

        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) % 2 == 0) {
                listNumber.remove(i);
                i--;
            }
        }
        System.out.println(listNumber);
    }
}
