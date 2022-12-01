package com.example.ArrayBi;

public class Main {

    /**
     *
     * Crea un array bidimensional de enteros y recórrelo,
     * mostrando la posición y el valor de cada elemento en ambas dimensiones.
     */
    public static void main(String[] args) {

        Integer[][] numbers = {
                {2, 4, 6, 8},
                {1, 3, 5, 7},
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
    }
}
