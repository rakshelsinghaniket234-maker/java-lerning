import java.util.Scanner;
public class BinaryConvert{

        public static void main(String[]args){

               int arr[] = new int[10];

               Scanner sc = new Scanner(System.in);

               System.out.println("enter number");

               int n = sc.nextInt();//6

               int i = 0;

               while(n!=0){//n=1

                    int r = n%2;//r=1

                    arr[i] = r;

                    i++;//3;

                    n = n/2;

               }

                    System.out.println("binary number");

                    for(i=i-1; i>=0; i--){

                        System.out.println("\t"+arr[i]);


                    }


        }

}