import java.util.Scanner;
public class ArrayLoop{

        public static void main(String[]args){

               int arr[] = new int[5];

                Scanner sc = new Scanner(System.in);

                int i = 1;

                for(i=0; i<arr.length; i++){
                   
                       System.out.printf("\n enter element index of %d :",i);

                        arr[i] = sc.nextInt();

                }

                   System.out.printf("Output of the arry ");

                   for(i=0; i<arr.length; i++){

                    System.out.printf("\n element of %d index %d ", i,arr[i]);



                   }


         }

}
