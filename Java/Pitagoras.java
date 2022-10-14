import java.util.Scanner;

public class Pitagoras{
 public static void main(String args[]){

  double despeje, hipotenusa, cateto_uno, cateto_dos;
 
  Scanner teclado = new Scanner(System.in);

  System.out.println("Hola. A través de este programa podrás ejecutar el teorema de pitágoras para calcular determimnado cateto o hipotenusa de un triángulo rectángulo.");
  System.out.println("Primero debemos conocer si deseas hallar el valor de un cateto o de la hipotenusa de tu triángulo. Ingrese el valor respectivo: 1 para hipotenusa y 2 para cateto.");

  despeje = teclado.nextInt();

   if(despeje == 1){
   
    System.out.println("Has elegido el programa para hallar la hipotenusa de tu triángulo. Ahora debemos conocer el valor de tu primer cateto (sin unidades)...");
    cateto_uno = teclado.nextInt();

    System.out.println("Ahora debemos conocer el valor de tu segudno cateto (sin unodades)...");
    cateto_dos = teclado.nextInt();

    System.out.println("Calculando resultado...");

    hipotenusa = Math.sqrt(Math.pow(cateto_uno,2) + Math.pow(cateto_dos,2)); 
    System.out.println("El valor de tu hipotenusa es de " + hipotenusa);
 
   }else if(despeje == 2){
   
    System.out.println("Has elegido el programa para hallar un cateto de tu triángulo. Ahora debemos conocer el valor de tu cateto (sin unidades)...");
    cateto_uno = teclado.nextInt();

    System.out.println("Ahora debemos conocer el valor de tu hipotenusa (sin unodades)...");
    hipotenusa = teclado.nextInt();

    System.out.println("Calculando resultado...");

    cateto_dos = Math.sqrt(Math.pow(hipotenusa,2) - Math.pow(cateto_uno,2)); 
    System.out.println("El valor de tu otro cateto es de " + cateto_dos);

   }else{
    
    System.out.println("El valor ingresado no es válido. Ejecutar el programa nuevamente");
 
   }
 
 }
}