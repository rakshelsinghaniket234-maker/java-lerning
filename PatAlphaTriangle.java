/*
A
BC
DEF
GHIJ
KLMNO
*/

public class PatAlphaTriangle{

        public static void main(String[]args){

               int a =1;
          
           for(int i=1; i<=5; i++){

                for(int j=1; j<=i; j++){
               
 
                    System.out.print((char)(a+64)+" ");

                     a++;
                      
                           

                }

                 System.out.println(" ");

  
            }

       }

}