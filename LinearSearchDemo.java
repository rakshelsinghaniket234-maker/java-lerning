import java.util.Scanner;
public class LinearSearchDemo{

        public static int linearsearch(int arr[],int k){

                     int result = 1;

                     for(int i=0;i<arr.length;i++){

                         if(k==arr[i]){

                               result = i+1;
                        

                         }

                     }


                          return result;

       }


           public static void main(String[]args){

                  int arr[] = {100,1,90,2,80,3,70,4,60,40,6};

                   Scanner sc = new Scanner(System.in);

                   System.out.println("enter key");

                   int key = sc.nextInt();

                   int r = linearsearch(arr,key);

                   if(r>=0){

                       System.out.println("element found at point" + r);

                   }

                      else{
 
                            System.out.println("element not found");

                       }
     
           }

}