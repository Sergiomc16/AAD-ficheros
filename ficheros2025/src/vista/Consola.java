package vista;

public class Consola {

    //metodo del programa que se llama para imprimir cualquier mensaje por consola
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Mensaje de confirmación de usuario guardado
    public static void usuarioGuardado(String usuario) {
        mostrarMensaje("\u001B[32m✔ Usuario \"" + usuario + "\" guardado correctamente.\u001B[0m");
    }

    //FALTAN LOS MENSAJE DE ERROR O CONFIRMACIÓN DEL NUMERO


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

    //mensaje de finalización al salir del programa con la opción 0.
    public static void despedida() {
        mostrarMensaje("\u001B[31mSaliendo del programa.\u001B[0m");
    }
}
