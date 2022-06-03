package src;

public class Main {

    public static void main(String[] args) {
        ManipularCSV archivo = new ManipularCSV();// crear objeto
        // ruta del archivo que se encuentra a nivel de las clases del proyecto
        String cadena = System.getProperty("user.dir")+"\\prueba.csv";
        archivo.leerArchivo(cadena);
    }
}