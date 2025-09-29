package servicio;

import modelo.Incidencia;
import modelo.Pokemon;
import repositorio.Fichero;

import java.time.LocalDate;
import java.time.LocalTime;

public class ServicioFichero {
    public static void guardar(LocalDate fecha, LocalTime hora, String tipoExcepcion, String usuario) {

        Incidencia incidencia1 = new Incidencia(fecha, hora, tipoExcepcion, usuario);
        Fichero log = new Fichero("datos/incidencias.txt");
        //el metodo addDato se encuentra en fichero
        log.addDato(incidencia1.toString());
    }

    public static void guardar(Incidencia miIncidencia) {
        Fichero log = new Fichero("datos/incidencias.txt");
        log.addDato(log.toString());
    }

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
