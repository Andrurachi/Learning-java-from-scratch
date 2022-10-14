import java.util.Scanner;

public class Operaciones{
  public static void main(String argas[]){

  String nombre = "";
  double p_digito = 0, s_digito = 0, resultado = 0;
  int parametro = 0;

  Scanner teclado = new Scanner(System.in);

  System.out.println("Bienvenido a la calculadora, ¿cuál es tu nombre?");
  nombre = teclado.nextLine();

  System.out.println(nombre + " Debemos conecocer los dígitos que deseas operar. ¿Cuál es tu primer dígito?");
  p_digito = teclado.nextDouble();

  System.out.println(nombre + " ¿Cuál es tu segundo dígito?");
  s_digito = teclado.nextDouble();

  System.out.println(nombre + " Ahora debemos saber qué tipo de operación deseas realizar?...(Disponible suma=1, resta=2, multiplicación=3 y divisón=4)");
  parametro = teclado.nextInt();

 switch(parametro){
    
   case 1: resultado = p_digito + s_digito;
   System.out.println("El resultado de tu suma es: " + resultado);
   break;

   case 2: resultado = p_digito - s_digito;
   System.out.println("El resultado de tu resta es: " + resultado);
   break;

   case 3: resultado = p_digito * s_digito;
   System.out.println("El resultado de tu multiplicación es: " + resultado);
   break;

   case 4: resultado = p_digito / s_digito;
   System.out.println("El resultado de tu división es: " + resultado);
   break;

   default: System.out.println("El valor de operación asigando no corresponde a ninguna disponible. Favor ejecute nuevamente");
   break;

  }
 
  
 }
}