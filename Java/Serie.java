public class Serie{
 public static void main (String args[]){

  int i = 1;
  int e = 1;
  int o = 1;
 
  System.out.println ("Serie con For");

  for(i = 1; i <= 10; i++){
   if(i < 10){
   System.out.print(i +",");
   
   }else{
    System.out.println(i);
    }
    
   } 

  System.out.println ("Serie con Dowhile");

  do{
    if(e < 10){
    System.out.print(e +",");
    
    }else{
    System.out.println(e);
    }
    
    e++;
   
   }while(e <= 10);

  System.out.println ("Serie con While");

  while(o <= 10){
    if(o < 10){
    System.out.print(o +",");
    
    }else{
    System.out.print(o);
    }
    
    o++;
    }

 }
}