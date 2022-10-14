public class Ciclo{
 public static void main (String args[]){

 int i = 1;

 System.out.println("Ciclo con for");

 for(i = 1; i <= 5; i++){

  int e = 100 - i;
  
  if(i < 5){
    System.out.print(i + ", ");
    System.out.print(e + ", ");
  
  }else{
  System.out.print(i + ", ");
  System.out.println(e);
  }
 }

   System.out.println("");
 
   System.out.println("Ciclo con While");
 
    int u = 1;

  while(u <= 5){

   int o = 100 - u;
   

    if(u < 5){
      System.out.print(u + ", ");
      System.out.print(o + ", ");
   }else{
      System.out.print(u + ", ");
      System.out.println(o); }

    u++;
 }
   int a = 1;

  System.out.println("");
 
  System.out.println("Ciclo con Dowhile");

   do{
     int j = 100 - a;
   

     if(a < 5){
      System.out.print(a + ", ");
      System.out.print(j + ", ");
     }else{
      System.out.print(a + ", ");
      System.out.println(j); }

     a++; 
   } while(a <= 5);

  

 }
}