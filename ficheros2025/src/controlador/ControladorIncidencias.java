package controlador;

import modelo.Pokemon;
import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

public class ControladorIncidencias {
    //AQUI VAN LAS EXCEPCIONES

    //INICIO DEL PROGRAMA
    public static void iniciar() {
        //pedir usuario
        //pedir numero
        //mostrar menu
            //introducir datos
                //buscar usuario
                //buscar fecha

        //pedir usuario
        String usuario = Escaner.pedirDato("\u001B[36mIntroduce tu nombre de usuario: \u001B[0m");
        Consola.usuarioGuardado(usuario);

        //pedir numero
        String numero = Escaner.pedirDato("\u001B[36mIntroduce un número del 1 al 3: \u001B[0m");


        //DESARROLLO DEL NUMERO


        //REVISAR LA ESTRUCTURA DEL SWITCH

        //mostrar menú
        boolean salir = false;

        do {
            Consola.mostrarMenu();

            String opcion = Escaner.pedirDato("\u001B[33mElige una opción: \u001B[0m");

            switch (opcion) {
                case "1":
                    Escaner.pedirDato("\u001B[36mIntroduce el usuario de búsqueda: \u001B[0m");


                    break;

                case "2":
                    Escaner.pedirDato("\u001B[36mIntroduce la fecha de búsqueda: \u001B[0m");


                    break;

                case "0":
                    Consola.despedida();
                    salir = true;

                    break;

                default:
                    Consola.errorBusqueda();

                    break;
            }

        } while(!salir);

        /*
        String nombre = Escaner.pedirDato("nombre del pokemon?");
        String tipo = Escaner.pedirDato("tipo pokemon?");

        ServicioFichero.guardar(nombre, tipo);
        ServicioFichero.guardar(new Pokemon(tipo, nombre));
        */

    }

    public static int parseIint (String valor) {
        int numero;

        return numero = Integer.parseInt(valor);
    }

    public static void validacionNumero (int numero) {
        if (numero < 1 || numero > 3) {

        } else if () {

        }
    }



}