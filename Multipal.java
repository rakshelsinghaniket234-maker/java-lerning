//import java.util.Scanner;
public class Multipal{
     public static void main(String[]args){
     int[] arr = {2,0,0,3,4,5,0};
   
    int product = 1;

    int count = 0;
     

      for(int i=0; i<arr.length; i++){
    
        if(arr[i]==0){
           count++;
         
   
        }

         else{
          product*=arr[i];


}

}
         
         System.out.println(count);
         System.out.println(product);
   }
}



