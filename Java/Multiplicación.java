import java.util.Scanner;

Public class Multiplicación{
 public static void main (String args[]){

   Scanner teclado = new Scanner(System.in);
   String nombre = "";
   int Num_uno = 0, int Num_dos = 0, resultado = 0;

   System.out.println("HOLA, ¿CUÁL ES TU NOMBRE?");
   nombre = teclado.nextLine();

   System.out.println("¿Cuál es el primer dígito de tu multiplicación");
   Num_uno = teclado.nextInt();

   System.out.println("¿Cuál es el segundo dígito de tu multiplicación");
   Num_dos = teclado.nextInt();

   resultado = Num_uno * Num_dos;

   System.out.println("Hola " + nombre + "el resultado de tu multiplicación es " + resultado);
   

 }
}
