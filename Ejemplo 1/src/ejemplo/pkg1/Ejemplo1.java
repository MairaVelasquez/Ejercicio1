/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int num;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.print("Ingrese un valor entero:");
                num = teclado.nextInt();
                int cuadrado = num * num;
                System.out.print("El cuadrado de " + num + " es " + cuadrado);
            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                teclado.next();
                continua = true;
            }
        } while (continua);
    }
    
}
