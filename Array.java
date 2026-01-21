public class Array{

        public static void main(String[]args){

                int n =1234;

                int count = 0;

                while(n!=0){

                int r = n%10;

                n = n/10;

                int n1 = n;

                  while(n1==0){
                 
                  int r1 = n1%10;

                     if(r==r1){
                       count++;
                       

                      }
                            
                         n1 = n/10;


                  }


                  }


                      if(count>0){

                           System.out.println("not unique");


                      }


                        else{
                              System.out.println("unique");


                      
                }

 
       }

}