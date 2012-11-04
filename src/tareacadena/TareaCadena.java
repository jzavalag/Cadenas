/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacadena;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jesus Zavala
 */
public class TareaCadena
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        System.out.print("Instituto Tecnológico Superior de Escárcega \n");
        System.out.print("Jesús del C. Zavala González \n");
        System.out.print("1.- Ayuda ");
        System.out.print("2.- Invertir Nombre ");
        System.out.print("3.- Largo del Nombre ");
        System.out.print("4.- Lee INICIO/FIN ");
        System.out.print("Lee FIN/INICIO ");

        Scanner teclado = new Scanner(System.in);

        int opcion = teclado.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.print("AYUDA:\n 2.- invertir una cadena (ingresa una cadena en el teclado y la muestra de manera inversa).\n 3.- mostrar el largo de la cadena que leiste.\n 4.- leer una cadena y dos numeros (que se va a llamar inicio y fin, inicios siempre debe de ser menor que fin) mostrar la subcadena del rango inicio y fin.\n 5.- leer una cadenas leer dos numeros que se llamaran FIN e INICIO e mostrar el rango que hay entre FIN-INICIO.");
                break;

            case 2:
                String cadena = teclado.next();

                for (int i = cadena.length() - 1; i >= 0; i--)
                {
                    char c = cadena.charAt(i);
                    System.out.print(c + " ");
                }

                break;
            case 3:
                String palabra = teclado.next();
                System.out.println("El largo de la Cadena es : " + palabra.length());

                break;

            case 4:
                String nombre = teclado.next();
                System.out.println("La subcadena entre la posición 4 y 9 es : " + nombre.substring(4, 9));

                break;
                
            case 5:
                String nombre2 = teclado.next();
                
                for (int i = nombre2.length() - 1; i >= 0; i--)
                {
                    char c = nombre2.charAt(i);
                   
                }
                System.out.println("La subcadena entre la posición 4 y 9 es : " + nombre2.substring(2, 6));
                
                break;

        }



    }
}

//  esto es para saber el numero de un caracter en especial              
//System.out.println("En la posición 14 está el carácter : " + nombre.charAt(14));
// esto es para imprimir la cadena aparti de un caracter
//System.out.println("La subcadena desde la posición 20 es : " + nombre.substring(20));