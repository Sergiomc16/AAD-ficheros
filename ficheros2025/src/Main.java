import controlador.ControladorIncidencias;
import modelo.Incidencia;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ControladorIncidencias.iniciar();

        /*
        String cadena="2025-09-18;16:01:00;excepción test 3;usuario1";

        //array de datos
        String[] datos = cadena.split(";");
        //split mete el contenido en cada una de las posiciones (delimitadas por ;)
        datos = cadena.split(";");

        //un array no se puede imprimir directamente (arraylist si)
        System.out.println(Arrays.toString(datos));

        //hay que cambiar el tipo de dato de String del array a fecha y hora
        Incidencia fallo = new Incidencia(LocalDate.parse(datos[0]), LocalTime.parse(datos[1]), datos[2], datos[3]);
        */


    }

}