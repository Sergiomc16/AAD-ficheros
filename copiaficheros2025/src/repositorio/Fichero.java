package repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fichero {

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

    //el ArrayList será listaIncidencias
    public List<String> leerFichero() {
        String cadena = "";
        List<String> listaCadenas = new ArrayList<>();

        FileReader fichero =null;
        BufferedReader lector = null;

        try {
            fichero = new FileReader("datos/incidencias.txt");
            lector = new BufferedReader(fichero);

            do {
                cadena = lector.readLine();
                if(cadena != null) {
                    listaCadenas.add(cadena);
                }
            } while(cadena != null);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                } else if (fichero != null) {
                    fichero.close();
                }

            } catch(IOException e) {
                System.out.println("Error al realizar la lectura");
            }
        }

        return listaCadenas;
    }

    //void porque solo añadirá al fichero sin devolver nada
    public void escribirFichero(String dato) {
        //conectará y añadirá la línea al fichero
        FileWriter fichero = null;

        try {
            fichero = new FileWriter("datos/incidencias.txt", true);
            fichero.write(dato + "\n");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");

        } finally {
            try {
                if (fichero != null){
                    fichero.close();
                }

            } catch(IOException e) {
                System.out.println("Error al cerrar el FileWriter");
            }
        }
    }

}
