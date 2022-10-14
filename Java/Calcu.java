import java.util.Scanner;

public class Calcu{
 public static void main(String args[]){
 
  Scanner teclado = new Scanner(System.in);

  int operacion = 0;
  double p_digito = 0;
  double s_digito = 0;
  double resultado = 0;
 

  System.out.println("Bienvenido a la calculadora b�sica. Aqu� podr�s realizar operaciones b�sicas (suma, resta, multiplicaci�n y divisi�n)");
  System.out.println("************************************************************************");
  System.out.println("");
  System.out.println("");
  System.out.println("Primero debemos saber qu� tipo de operaci�n quieres hacer (ten en cuenta: suma=1, resta=2, multiplicaci�n=3, divisi�n=4.)");
  operacion = teclado.nextInt();

  if(operacion == 1){
     System.out.println("Ahora que has elegido suma, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operaci�n...");
     resultado = p_digito + s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu suma es " + Math.round(resultado));


  } else if(operacion == 2){
     System.out.println("Ahora que has elegido resta, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operaci�n...");
     resultado = p_digito - s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu resta es " + Math.round(resultado));


  } else if(operacion == 3){
     System.out.println("Ahora que has elegido multiplicaci�n, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operaci�n...");
     resultado = p_digito * s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu multiplicaci�n es " + Math.round(resultado));


  } else if(operacion == 4){
     System.out.println("Ahora que has elegido divisi�n, debemos conocer los dos valores que deseas operar. Ingresa el primer valor, por favor");
     p_digito = teclado.nextDouble();
    
     System.out.println("Debemos conocer el otro valor que deseas operar. Ingresa el segundo valor, por favor");
     s_digito = teclado.nextDouble();
  
     System.out.println("Calculando el resultado de tu operaci�n...");
     resultado = p_digito / s_digito;

     System.out.println("*******************************************");
     System.out.println("El resultado de tu divisi�n es " + Math.round(resultado));

 
  } else{
    System.out.println("El n�mero que has elegido no corresponde a ninguna operaci�n del programa. Int�ntalo nuevamente");
    }


 }
}