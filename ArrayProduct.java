import java.util.Scanner;
public class ArrayProduct{

   public static void main(String[]args){

       Scanner sc = new Scanner(System.in);

       System.out.println("enter earray of size");

        int n = sc.nextInt();

        System.out.println("array of element");

        int[] arr = new int[n];

        long product = 1;

         for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            product*=arr[i];

        }

            for(int i=0; i<n; i++){

             System.out.println(arr[i]);
          
            }
        System.out.println( product);

 }
}