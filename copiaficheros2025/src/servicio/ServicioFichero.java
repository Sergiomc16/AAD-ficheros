package servicio;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import repositorio.Fichero;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioFichero {

    private static final String ruta = "datos/incidencias.txt";

    public static void guardar(LocalDate fecha, LocalTime hora, String tipoExcepcion, String usuario) {
        Incidencia incidencia1 = new Incidencia(fecha, hora, tipoExcepcion, usuario);
        Fichero log = new Fichero(ruta);

        //el metodo escribirFichero se encuentra en Fichero
        log.escribirFichero(incidencia1.toString());
    }

    public static void guardar(Incidencia miIncidencia) {
        Fichero log = new Fichero(ruta);

        log.escribirFichero(miIncidencia.toString());
    }
    

    /*
    //metodo de buscar por usuario
    public static ArrayList<Incidencia> buscarDato(String dato, listaIncidencias datos) {
        Fichero log = new Fichero(ruta);

        ArrayList<Incidencia> lista= new ListaIncidencias();

        for (Incidencia item : datos) {
            if (item.getUsuario().equals(usuario)) {
                //usuario siempre va a estar en la cuarta posicion del Array
                String datoLinea = datos[3].trim();

                if (datoLinea.equalsIgnoreCase(dato.trim())) {
                    busqueda.add(linea);
                }
            }
        }

        return busqueda;
    }
    */

    /*
    public static void guardar(String nombre, String tipo) {
        Pokemon pikachu = new Pokemon(nombre, tipo);
        Fichero pokedex = new Fichero("datos/pokemon.txt");
        //el metodo addDato se encuentra en fichero
        pokedex.addDato(pikachu.toString());
    }

    public static void guardar(Pokemon miPokemon) {
        Fichero pokedex = new Fichero("datos/pokemon.txt");
        pokedex.addDato(pokedex.toString());
    }
    */
}
