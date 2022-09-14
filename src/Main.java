package src;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        String cadena = System.getProperty("user.dir")+"\\prueba.csv";

        // ruta del archivo que se encuentra a nivel de las clases del proyecto
        ArrayList<ArrayList<String>> arreglo;
        try {
            CSVFile.read(cadena, true);// crear objeto
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

//    Table table = CSVFile.read(ruta, true);

}