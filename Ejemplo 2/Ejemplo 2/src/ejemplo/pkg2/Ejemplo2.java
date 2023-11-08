
package ejemplo.pkg2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemplo2 {

   public static float cociente( int numerador, int denominador )
    throws ArithmeticException
     {
     return numerador / denominador; 
     }
    public static void main(String[] args) {
       Scanner explorador = new Scanner( System.in ); 
       boolean continuarCiclo = true; 
       do {
       try 
       {
       System.out.print( "Introduzca un numerador entero: " );
       int numerador = explorador.nextInt();
       System.out.print( "Introduzca un denominador entero: " );
        int denominador = explorador.nextInt();
        double resultado = cociente( numerador, denominador );
        System.out.printf( "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
        continuarCiclo = false;  } 
       catch ( InputMismatchException inputMismatchException )
       {
        System.err.printf( "\nExcepcion: %s\n",inputMismatchException );
        explorador.nextLine(); // descarta entrada para que el usuario intente otra vez
        System.out.println("Debe introducir enteros. Intente de nuevo.\n" );} // fin de bloque catch
         catch ( ArithmeticException arithmeticException ){
        System.err.printf( "\nExcepcion: %s\n", arithmeticException );
        System.out.println("Cero es un denominador invalido. Intente de nuevo.\n" );} // fin de catch
        } while ( continuarCiclo );
    }
    
}
