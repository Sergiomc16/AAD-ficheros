package servicio;

import modelo.Incidencia;
import modelo.ListaIncidencias;
import repositorio.Fichero;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ServicioFichero {
    public static void guardar(LocalDate fecha, LocalTime hora, String tipoExcepcion, String usuario) {
        //creamos un objeto incidencia
        Incidencia incidencia1 = new Incidencia(fecha, hora, tipoExcepcion, usuario);
        Fichero log = new Fichero("datos/incidencias.txt");

        //el metodo escribirFichero se encuentra en Fichero (escribirá la incidencia con su formato definido)
        log.escribirFichero(incidencia1.toString());
    }

    public static ListaIncidencias StringAObjetoIncidencia() {
        Fichero log = new Fichero("datos/incidencias.txt");

        List<String> lineas = log.leerFichero();

        ListaIncidencias lista = new ListaIncidencias();

        for (String linea : lineas) {
            String[] datos = linea.split(";");

            try {
                //creamos el objeto incidencia y lo guaradamos en una listaincidencias
                Incidencia incidencia = new Incidencia(LocalDate.parse(datos[0]),
                        LocalTime.parse(datos[1]), datos[2], datos[3]);

                lista.getLista().add(incidencia);

            } catch (Exception e) {
                System.err.println("Error al parsear la línea");
            }
        }

        return lista;
    }

    //metodo de buscar por usuario
    public static List<Incidencia> buscarUsuario(String usuario) {
        ListaIncidencias lista = StringAObjetoIncidencia();

        List<Incidencia> busqueda = new ArrayList<>();

        for (Incidencia i : lista.getLista()) {

            if (i.getUsuario().equalsIgnoreCase(usuario)) {
                busqueda.add(i);
            }
        }

        return busqueda;
    }

    //metodo de buscar entre fechas
    public static List<Incidencia> buscarFecha(LocalDate fechaInicial, LocalDate fechaFinal) {
        ListaIncidencias lista = StringAObjetoIncidencia();

        List<Incidencia> busqueda = new ArrayList<>();

        for (Incidencia i : lista.getLista()) {
            //Según la documentación de java:
            //isEqual es exclusivo de LocalDate (si no sería equals)
            //isBefore y isAfter sirven para comparar fechas (también exclusivos de LocalDate)

            //fechaInicial: solo puede ser igual o posterior
            //fechaFinal: solo puede ser igual o anterior

            if ( (i.getFecha().isEqual(fechaInicial) || i.getFecha().isAfter(fechaInicial)) &&
                    (i.getFecha().isEqual(fechaFinal) || i.getFecha().isBefore(fechaFinal)) ) {
                busqueda.add(i);
            }
        }

        return busqueda;
    }

}
