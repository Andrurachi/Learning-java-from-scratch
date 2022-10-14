public class Notas{ 
 public static void main (String args[]){ 
 
   int matematicas = 5;
   int sociales = 3;
   int religion = 7;
   int promedio = 0;

   promedio = (matematicas + sociales+ religion) / 3;

   if( promedio >=5){ 
   System.out.println ("el estudiante aprobó");
   } else {System.out.println ("el estudiante reprobó");

   System.out.println ("con un promedio de " + promedio);
  }
 }
}