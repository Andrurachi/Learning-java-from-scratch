import java.util.Scanner;

public class Peso{
  public static void main(String args[]){

   Scanner teclado = new Scanner(System.in);
   String nombre = "";
   int peso_tierra = 0; 
   double peso_marte = 0; 
   double gravedad_tierra = 9.8; 
   double gravedad_marte = 3.7; 
   double gravedad_jupiter = 24.7;
   double masa = 0;
   int planeta = 0;
   double peso_jupiter = 0;
 
   System.out.println("Hola, ¿cuál es tu nombre?");
   nombre = teclado.nextLine();

   System.out.println(nombre + ", a través de este programa podrás averiguar tu peso en marte o en Júpiter.");
   System.out.println("Primero debemos saber tu peso en la tierra, ¿cuánto pesas?");
   peso_tierra = teclado.nextInt();
   
   System.out.println("¿En qué planeta quieres medir tu peso? 1 es Marte y 2 es Júpiter ");
   planeta = teclado.nextInt();
  
   if(planeta == 1){

      System.out.println("calculando tu peso en marte...");
      masa = peso_tierra / gravedad_tierra;
      peso_marte = masa * gravedad_marte;

      System.out.println("Hola " + nombre + ",tu peso en Marte corresponde a " + Math.round(peso_marte) + "Kg");    
   
   } else if(planeta == 2){
      
      System.out.println("calculando tu peso en Júpiter...");
      masa = peso_tierra / gravedad_tierra;
      peso_jupiter = masa * gravedad_jupiter;

      System.out.println("Hola " + nombre + ",tu peso en Júpiter corresponde a " + Math.round(peso_jupiter) + " Kg");
   
   } else {
      System.out.println("El planeta asignado no está habilitado ");
   }


  
 }
}