import java.util.Scanner;

public class Operaciones{
  public static void main(String argas[]){

  String nombre = "";
  double p_digito = 0, s_digito = 0, resultado = 0;
  int parametro = 0;

  Scanner teclado = new Scanner(System.in);

  System.out.println("Bienvenido a la calculadora, �cu�l es tu nombre?");
  nombre = teclado.nextLine();

  System.out.println(nombre + " Debemos conecocer los d�gitos que deseas operar. �Cu�l es tu primer d�gito?");
  p_digito = teclado.nextDouble();

  System.out.println(nombre + " �Cu�l es tu segundo d�gito?");
  s_digito = teclado.nextDouble();

  System.out.println(nombre + " Ahora debemos saber qu� tipo de operaci�n deseas realizar?...(Disponible suma=1, resta=2, multiplicaci�n=3 y divis�n=4)");
  parametro = teclado.nextInt();

 switch(parametro){
    
   case 1: resultado = p_digito + s_digito;
   System.out.println("El resultado de tu suma es: " + resultado);
   break;

   case 2: resultado = p_digito - s_digito;
   System.out.println("El resultado de tu resta es: " + resultado);
   break;

   case 3: resultado = p_digito * s_digito;
   System.out.println("El resultado de tu multiplicaci�n es: " + resultado);
   break;

   case 4: resultado = p_digito / s_digito;
   System.out.println("El resultado de tu divisi�n es: " + resultado);
   break;

   default: System.out.println("El valor de operaci�n asigando no corresponde a ninguna disponible. Favor ejecute nuevamente");
   break;

  }
 
  
 }
}