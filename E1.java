//exception handling

class E1{

       public static void main(String[]args){

              int a,b,c = 0;

              System.out.println("before");

              a = 10;

              b = 0;

              System.out.println("after");

               try{

              c = a/b;
                  
               System.out.println("inside try");
   
               }catch(ArithmeticException ae){

               System.out.println("Denominator sholud be zero");

               //ae.printStackTrace();

               }

               System.out.println("result"+c);



       }

}