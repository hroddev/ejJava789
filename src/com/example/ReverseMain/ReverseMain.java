package com.example.ReverseMain;

public class ReverseMain {

    /**
     * Escribe el código que devuelva una cadena al revés. Por ejemplo,
     * la cadena "hola mundo", debe retornar "odnum aloh"
     * @param args
     */
    public static void main(String[] args) {

        String[] normalWords = "hola mundo".split("");
        String reverseWords = "";
        for (int i = normalWords.length -1; i >= 0 ; i--) {
            reverseWords += normalWords[i];
        }
        System.out.println(reverseWords);
    }
}
