import java.util.Scanner;

public class Trabajo{
 public static void main (String args[]){

  Scanner teclado = new Scanner(System.in);
  String nombre = "";
  int clave = 0;
  int años = 0;

  System.out.println("Hola, ¿cuál es tu nombre?");
  nombre = teclado.nextLine();

  System.out.println(nombre + ", a través de este programa podrás conocer los días de vacaciones que mereces con respecto a tu clave y tu antigüedad en el trabajo.");
  System.out.println("Primero debemos saber a cuál clave correspondes (únicamente 1, 2, 3 disponibles)...");
  
  clave = teclado.nextInt();

  if(clave == 1){
    System.out.println("Ahora debemos conocer tu antigüedad en la empresa... ¿hace cuántos años trabajas con nostros?");
    años = teclado.nextInt();
   
    if (años <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 7 días de vacaciones");

    } else if (años >= 2 && años <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 14 días de vacaciones");

    } else if (años >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 20 días de vacaciones");
    }
        
  } else if (clave == 2){
    System.out.println("Ahora debemos conocer tu antigüedad en la empresa... ¿hace cuántos años trabajas con nostros?");
    años = teclado.nextInt();
   
    if (años <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 7 días de vacaciones");

    } else if (años >= 2 && años <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 15 días de vacaciones");

    } else if (años >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 22 días de vacaciones");
    }  

  } else if(clave == 3){
    System.out.println("Ahora debemos conocer tu antigüedad en la empresa... ¿hace cuántos años trabajas con nostros?");
    años = teclado.nextInt();
   
    if (años <= 1){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 10 días de vacaciones");

    } else if (años >= 2 && años <= 6){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 20 días de vacaciones");

    } else if (años >= 7){
      System.out.println(nombre + ", los trabajadores con tus condiciones recibirán 30 días de vacaciones");
    }

  } else {
    System.out.println(nombre + ", la clave que has ingresado no existe");
   }


 }
}