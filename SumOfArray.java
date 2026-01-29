import java.util.Scanner;
public class SumOfArray{
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.println("enter size");

    int n = sc.nextInt();

     System.out.println("array of element");

     int[] arr = new int[n];

     int sum = 0;

     for(int i=0; i<n; i++){

      arr[i] = sc.nextInt();

      sum +=arr[i];

     }

          for(int i=0; i<n; i++){

         System.out.println(arr[i] + " ");

       

       }

       System.out.println( sum);


}

}