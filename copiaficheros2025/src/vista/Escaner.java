package vista;

import java.util.Scanner;

public class Escaner {
    static Scanner sc = new Scanner(System.in);

    public static String pedirDato(String mensaje) {
        //el usuario introducirá su nombre de usuario para el log
        //ESTE METODO SERVIRA TAMBIEN PARA PEDIR BUSCAR POR FECHA Y USUARIO
        System.out.println(mensaje);

        String entradaDato = sc.nextLine().trim();

        return entradaDato;
    }

}
