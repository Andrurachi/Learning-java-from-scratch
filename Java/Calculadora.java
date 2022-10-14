import java.util.Scanner;

public class Calculadora{
 public static void main (String args[]){ 

  Scanner teclado = new Scanner (System.in);
  String nombre = "";
  int num_uno = 0, num_dos = 0, resultado = 0;
  String operacion = "";
 
  System.out.println ("¿cual es tu nombre?");
  nombre = teclado.nextLine();

  System.out.println ("Dame el primer digito de tu operacion: ");
  num_uno = teclado.nextInt();

  System.out.println ("Dame el segundo digito de tu operacion: ");
  num_dos = teclado.nextInt();

  System.out.println ("¿que tipo de operacion quieres hacer?, disponible suma y resta");
  operacion = teclado.nextLine();

  if (operacion == "suma"){
      resultado = num_uno + num_dos;
  }else { 
      resultado = num_uno - num_dos;
 } 
  System.out.println (nombre + ", el resultado de tu operacion es de: " + resultado);
 }
}