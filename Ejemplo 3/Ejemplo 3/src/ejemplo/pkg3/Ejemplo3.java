
package ejemplo.pkg3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo a leer: ");
        String nombreArchivo = scanner.nextLine();

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo no existe en el sistema.");
        } catch (IOException e) {
            System.err.println("Error de lectura del archivo.");
        }
          
          
   }
}
