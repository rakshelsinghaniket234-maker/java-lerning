import java.util.Scanner;
public class ArrayTakingInput{

        public static void main(String[]args){

                Scanner sc = new Scanner(System.in);
                 int n = sc.nextInt();

                 int[] arr = new int[n];

                 int countp = 0;

                 int countn = 0;
                 
                 for(int i=0; i<n; i++){
           
                      System.out.printf("enter array element index: ",i);
                      arr[i] = sc.nextInt();

                      if(arr[i]>0){
                     
                          countp++;

                      }
                
                      else{
               
                           countn++;



                      }

                 }
                    
                                      
                          System.out.println("number of positive element :"+countp);

                          System.out.println("number of negative element :"+countn);

                      


        }

}