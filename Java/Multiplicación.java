import java.util.Scanner;

Public class Multiplicaci�n{
 public static void main (String args[]){

   Scanner teclado = new Scanner(System.in);
   String nombre = "";
   int Num_uno = 0, int Num_dos = 0, resultado = 0;

   System.out.println("HOLA, �CU�L ES TU NOMBRE?");
   nombre = teclado.nextLine();

   System.out.println("�Cu�l es el primer d�gito de tu multiplicaci�n");
   Num_uno = teclado.nextInt();

   System.out.println("�Cu�l es el segundo d�gito de tu multiplicaci�n");
   Num_dos = teclado.nextInt();

   resultado = Num_uno * Num_dos;

   System.out.println("Hola " + nombre + "el resultado de tu multiplicaci�n es " + resultado);
   

 }
}
