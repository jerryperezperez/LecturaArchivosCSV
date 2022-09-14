package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class CSVFile {
    private static BufferedReader lector;//lee el archivo
    private static String linea; //recibe la línea de cada fila

    public static Table read(String nombreArchivo, boolean includedHeaders) throws Exception {
        Table table = new Table();
        linea = null;
        lector = new BufferedReader(new FileReader(nombreArchivo));
        Function<String, Integer> stringIntegerFunction = (String line2a) -> {
            try {
                return lector.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        while ((linea = lector.readLine()) != null) {
            table.addRow(new ArrayList<>(Arrays.asList(linea.split(","))));
            System.out.println(linea);
        }
//        if (includedHeaders ==true) headers.addAll(content.remove(0));
        lector.close();
        return table;
    }
}
