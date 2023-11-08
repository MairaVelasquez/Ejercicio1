/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones4;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones4 {

    public static void main(String[] args) {
        
        ExcepcionA a = new ExcepcionA("Debe ingresar obligatoriamente un numero entero");
        ExcepcioB b= new ExcepcioB("Debe ingresar obligatoriamente un  entero");
        ExcepcionC c = new ExcepcionC("Debe ingresar un numero entero");
        
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
                System.out.println("Se ha capturado la siguiente excepcion:\n"+ a.getMensaje());
                System.out.println("\n"+ b.getMensaje());
                 System.out.println("\n"+ c.getMensaje());//A pesar de no tener ningun atributo mensaje y metodo get en las Excepcion B y (YA QUE SE HEREDA DE A), el mensaje se obtiene al compilarse
                teclado.next();
                continua = true;
            }
        } while (continua);
    }
    
}
