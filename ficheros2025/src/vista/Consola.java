package vista;

public class Consola {

    //metodo del programa que se llama para imprimir cualquier mensaje por consola
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Mensaje de confirmación de usuario guardado
    public static void usuarioGuardado(String usuario) {
        mostrarMensaje("\u001B[32mUsuario \"" + usuario + "\" guardado correctamente.\u001B[0m");
    }

    //Menú del programa
    public static void mostrarMenu() {
        String cyan  = "\u001B[36m";
        String reset = "\u001B[0m";

        mostrarMensaje(
                cyan + "\n╔══════════════════════════════════╗\n" +
                        "║        MENÚ DE INCIDENCIAS       ║\n" +
                        "╠══════════════════════════════════╣\n" +
                        "║  1. Buscar por usuario           ║\n" +
                        "║  2. Buscar por rango de fechas   ║\n" +
                        "║  0. Salir                        ║\n" +
                        "╚══════════════════════════════════╝" + reset
        );
    }

    //no hay resultados en la búsqueda por usuario
    public static void errorUsuario() {
        mostrarMensaje("\u001B[31mNo hay incidencias de este usuario.\u001B[0m");
    }

    //no hay resultados en la búsqueda por fechas
    public static void errorFecha() {
        mostrarMensaje("\u001B[31mNo hay incidencias en ese intervalo de fechas.\u001B[0m");
    }

    //mensaje de error al introducir un formato incorrecto de fecha
    public static void errorFormatoFecha() {
        mostrarMensaje("\u001B[31mEl formato de la fecha (yyyy-mm-dd) no es válido.\u001B[0m");
    }

    //no se elige una opción del menú
    public static void errorBusqueda() {
        mostrarMensaje("\u001B[31mNo es posible realizar esta acción.\u001B[0m");
    }

    //Mensaje de finalización al salir del programa con la opción 0
    public static void despedida() {
        mostrarMensaje("\u001B[31mSaliendo del programa.\u001B[0m");
    }

}
