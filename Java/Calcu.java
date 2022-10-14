import java.util.Scanner;

public class Calcu{
 public static void main(String args[]){
 
  Scanner teclado = new Scanner(System.in);

  int operacion = 0;
  double p_digito = 0;
  double s_digito = 0;
  double resultado = 0;
 

  System.out.println("Bienvenido a la calculadora básica. Aquí podrás realizar operaciones básicas (suma, resta, multiplicación y división)");
  System.out.println("************************************************************************");
  System.out.println("");
  System.out.println("");
  System.out.println("Primero debemos saber qué tipo de operación quieres hacer (ten en cuenta: suma=1, resta=2, multiplicación=3, división=4.)");
  operacion = teclado.nextInt();

  if(operacion == 1){
     System.out.println("Ahora que has elegido suma, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operación...");
     resultado = p_digito + s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu suma es " + Math.round(resultado));


  } else if(operacion == 2){
     System.out.println("Ahora que has elegido resta, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operación...");
     resultado = p_digito - s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu resta es " + Math.round(resultado));


  } else if(operacion == 3){
     System.out.println("Ahora que has elegido multiplicación, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operación...");
     resultado = p_digito * s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu multiplicación es " + Math.round(resultado));


  } else if(operacion == 4){
     System.out.println("Ahora que has elegido división, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operación...");
     resultado = p_digito / s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu división es " + Math.round(resultado));

 
  } else{
    System.out.println("El número que has elegido no corresponde a ninguna operación del programa. Inténtalo nuevamente");
    }


 }
}