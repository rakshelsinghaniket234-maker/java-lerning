//Q2

import java.util.Scanner;
public class ArrayInput{

        public static void main(String []args){

              int arr[] = new int[5];
               
              Scanner sc = new Scanner(System.in);

              System.out.println("enter element index of 0 :");

              arr[0] = sc.nextInt();

              System.out.println("enter element index of 1 :");

              arr[1] = sc.nextInt();

              
              System.out.println("enter element index of 2 :");

              arr[2] = sc.nextInt();

              System.out.println("enter element index of 3 :");

              arr[3] = sc.nextInt();

              System.out.println("enter element index of 4 :");

              arr[4] = sc.nextInt();

              System.out.println("size of the array :"+arr.length);

              System.out.println("element of index 0 : " + arr[1]);

              System.out.println("element of index 2 : " + arr[2]);

              System.out.println("element of index 3 : " + arr[3]);

              System.out.println("element of index 4 : " + arr[4]);

              System.out.println("element of index 5 : " + arr[5]);


        }

}