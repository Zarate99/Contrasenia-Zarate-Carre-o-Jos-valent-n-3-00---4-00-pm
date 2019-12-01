/*
 Porgrama que verifica si una contraseña es correcta de lo contario el usuario tendrá tres intentos.

 */
package contrasenia;

import java.util.Scanner; // Se importa la librería Scanner

/**
 *
 * @author José Valentín Zarate Carreño
 */
public class Contrasenia {

    public static void main(String[] args) { // inicio del main

        Contrasenia c = new Contrasenia(); // se instancia la clase 
        c.contrasenia(); // se llama al método contrasenia.

    } // cierre del main

    public void contrasenia() { // se inicia el método
        Scanner sc = new Scanner(System.in); //Declaración del Scanner para leer el teclado

        String password = "ITO"; // se crea una variable de tipo string que alamacenará la contraseña
        int i = 0; // creamos una variable para iterar en nuestro bucle
        while (i < 3) { // itera 3 veces
            System.out.println("Ingrese la contraseña: ");
            String dato = sc.nextLine(); // Variable String que guarda lo que se lee en teclado
            if (password.equalsIgnoreCase(dato)) { // Compara si el String introducido es igual a la contraseña
                System.out.println("¡contraseña correcta!"); // Si es igual, imprime una afirmación
                break; // se cierra el programa si se introduce el dato corrctamente a la primera.

            } else { // de lo contrario tendrá 2 intentos más
                System.out.println("¡verifique la contraseña es incorrecta!"); // Sí el String es diferente de la contraseña imprime una negación
            } // se cierra "else"

        } // cierre del bucle 

    } // cierre del método

} // ciere de la clase 
