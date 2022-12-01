package com.example.InOut;

import java.io.*;

public class InOutMain {

    /**
     * Utilizando InputStream y PrintStream, crea una función que reciba
     * dos parámetros: "fileIn" y "fileOut".
     * La tarea de la función será realizar la copia del fichero dado en el
     * parámetro "fileIn" al fichero dado en "fileOut".
     * 
     */

    public static void InOutFile(String fileIn, String fileOut) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(fileIn));
            byte[] data = in.readAllBytes();
            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
            in.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

        String fileInPath = "/etc/rsyslog.conf";
        String fileOutPath = "test.conf";

        InOutFile(fileInPath, fileOutPath);

    }
}
