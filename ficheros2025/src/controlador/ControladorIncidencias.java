package controlador;

import modelo.Incidencia;
import modelo.InvalidFormatException;
import modelo.InvalidNumberException;
import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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

        //FALTA DECLARAR LAS VARIABLES AL PRINCIPIO

        //pedir usuario
        String usuario = Escaner.pedirDato("\u001B[36mIntroduce tu nombre de usuario: \u001B[0m");
        Consola.usuarioGuardado(usuario);

        //pedir numero
        boolean numeroIntroducido = false;

        do {
            String numeroEnString = Escaner.pedirDato("\u001B[36mIntroduce un número del 1 al 3: \u001B[0m");

            int numero;

            //desarrollo del número
            try {
                numero = parseInt(numeroEnString);

                validacionNumero(numero);

                numeroIntroducido = true;

            } catch (InvalidFormatException e) {
                System.err.println(e.getMessage());

                //creamos y guardamos la incidencia
                ServicioFichero.guardar(LocalDate.now(), LocalTime.now(), "InvalidFormatException", usuario);

            } catch (InvalidNumberException e) {
                System.err.println(e.getMessage());

                //creamos y guardamos la incidencia
                ServicioFichero.guardar(LocalDate.now(), LocalTime.now(), "InvalidNumberException", usuario);
            }

        } while (!numeroIntroducido);

        //mostrar menú
        boolean salir = false;

        do {
            Consola.mostrarMenu();

            String opcion = Escaner.pedirDato("\u001B[33mElige una opción: \u001B[0m");

            switch (opcion) {
                case "1":
                    String usuarioBusqueda = Escaner.pedirDato("\u001B[36mIntroduce el usuario de búsqueda: \u001B[0m");

                    //faltaría estructurarlo en métodos aparte
                    List<Incidencia> resultadosUsuario = ServicioFichero.buscarUsuario(usuarioBusqueda);

                    if (resultadosUsuario.isEmpty()) {
                        Consola.errorUsuario();
                    } else {
                        for (Incidencia i : resultadosUsuario) {
                            Consola.mostrarMensaje(i.toString());
                        }
                    }

                    break;

                case "2":
                    String fechaInicialEnString = Escaner.pedirDato("\u001B[36mIntroduce la fecha de búsqueda inicial (yyyy-mm-dd): \u001B[0m");

                    String fechaFinalEnString = Escaner.pedirDato("\u001B[36mIntroduce la fecha de búsqueda final (yyyy-mm-dd): \u001B[0m");

                    //faltaría estructurarlo en métodos aparte
                    try {
                        LocalDate fechaInicial = LocalDate.parse(fechaInicialEnString);
                        LocalDate fechaFinal = LocalDate.parse(fechaFinalEnString);

                        List<Incidencia> resultadosFecha = ServicioFichero.buscarFecha(fechaInicial, fechaFinal);

                        if (resultadosFecha.isEmpty()) {
                            Consola.errorFecha();
                        } else {
                            for (Incidencia i : resultadosFecha) {
                                Consola.mostrarMensaje(i.toString());
                            }
                        }

                    } catch (Exception e) {
                        Consola.errorFormatoFecha();
                    }

                    break;

                case "0":
                    Consola.despedida();
                    salir = true;

                    break;

                default:
                    Consola.errorBusqueda();

            }

        } while(!salir);

    }

    //METODOS CON LAS EXCEPCIONES QUE VAN A SURGIR DEL PROGRAMA

    public static int parseInt (String valor) throws InvalidFormatException {
        int numero;

        try {
            numero = Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException("InvalidFormatException producida. " +
                    "El valor introducido no es un número");
        }

        return numero;
    }

    public static void validacionNumero (int numero) throws InvalidNumberException {
        if (numero < 1 || numero > 3) {
            throw new InvalidNumberException("InvalidNumberException producida. " +
                    "El número debe ser del 1 al 3");
        }
    }

}