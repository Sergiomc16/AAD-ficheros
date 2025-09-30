package repositorio;

import modelo.Incidencia;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fichero {
    //AQUI ESTARAN LOS METODOS
    //hay que añadir la incidencia
    //addFichero(incidencia)
    //buscar(String usuario)
    //buscar(LocalDate fecha )

    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }

    //void porque solo añadirá al fichero sin devolver nada
    public void addDato(String dato) {
        //conectará y añadirá la línea al fichero

    }

    //devolverá al buscar, un String con los datos del fichero
    public String buscarDato(String dato) {
        //conectará y añadirá la línea al fichero



        return "";
    }

    public String buscarDato(String dato, int columna) {
        //conectará y añadirá la línea al fichero



        return "";
    }

    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal) {
        //conectará y añadirá la línea al fichero


        return "";
    }

    public ArrayList<String> leerFichero(String dato) {


        return null;
    }

    public static void leerFichero() {
        String cadena = "";

        FileReader fichero =null;
        BufferedReader lector = null;

        try {
            fichero = new FileReader("datos/incidencias.txt");
            lector = new BufferedReader(fichero);

            do {
                cadena = lector.readLine();
                if(cadena != null) {
                    System.out.println(cadena);
                }
            } while(cadena != null);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }

    public static void escribirFichero(String dato) {
        FileWriter fichero =null;

        try {
            fichero = new FileWriter("datos/incidencias.txt", true);
            fichero.write(dato);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}
