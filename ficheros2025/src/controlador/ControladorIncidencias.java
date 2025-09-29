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


                    break;

                case "2":

                    break;

                case "0":
                    Consola.despedida();
                    salir = true;

                    break;

                default:
            }

        } while(!salir);

        /*
        String nombre = Escaner.pedirDato("nombre del pokemon?");
        String tipo = Escaner.pedirDato("tipo pokemon?");

        ServicioFichero.guardar(nombre, tipo);
        ServicioFichero.guardar(new Pokemon(tipo, nombre));
        */

    }
}