import java.util.Scanner;

public class Suma{
  public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    String nombre = "";
    int Num_uno = 0, Num_dos = 0, resultado = 0;

    System.out.println("�Cu�l es tu nombre?");
    nombre = teclado.nextLine();

    System.out.println("�Cu�l ser� el primer valor para tu suma?");
    Num_uno = teclado.nextInt();

    System.out.println("�Cu�l ser� el segundo valor para tu suma?");
    Num_dos = teclado.nextInt();

    resultado = Num_uno + Num_dos;

    System.out.println("Hola " + nombre + "El resultado de tu suma es " + resultado);
 }
}