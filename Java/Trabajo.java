import java.util.Scanner;

public class Trabajo{
 public static void main (String args[]){

  Scanner teclado = new Scanner(System.in);
  String nombre = "";
  int clave = 0;
  int a�os = 0;

  System.out.println("Hola, �cu�l es tu nombre?");
  nombre = teclado.nextLine();

  System.out.println(nombre + ", a trav�s de este programa podr�s conocer los d�as de vacaciones que mereces con respecto a tu clave y tu antig�edad en el trabajo.");
  System.out.println("Primero debemos saber a cu�l clave correspondes (�nicamente 1, 2, 3 disponibles)...");
  
  clave = teclado.nextInt();

  if(clave == 1){
    System.out.println("Ahora debemos conocer tu antig�edad en la empresa... �hace cu�ntos a�os trabajas con nostros?");
    a�os = teclado.nextInt();
   
    if (a�os <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 7 d�as de vacaciones");

    } else if (a�os >= 2 && a�os <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 14 d�as de vacaciones");

    } else if (a�os >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 20 d�as de vacaciones");
    }
        
  } else if (clave == 2){
    System.out.println("Ahora debemos conocer tu antig�edad en la empresa... �hace cu�ntos a�os trabajas con nostros?");
    a�os = teclado.nextInt();
   
    if (a�os <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 7 d�as de vacaciones");

    } else if (a�os >= 2 && a�os <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 15 d�as de vacaciones");

    } else if (a�os >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 22 d�as de vacaciones");
    }  

  } else if(clave == 3){
    System.out.println("Ahora debemos conocer tu antig�edad en la empresa... �hace cu�ntos a�os trabajas con nostros?");
    a�os = teclado.nextInt();
   
    if (a�os <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 10 d�as de vacaciones");

    } else if (a�os >= 2 && a�os <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 20 d�as de vacaciones");

    } else if (a�os >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibir�n 30 d�as de vacaciones");
    }

  } else {
    System.out.println(nombre + ", la clave que has ingresado no existe");
   }


 }
}