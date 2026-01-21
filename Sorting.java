/*before sorting

20  10 30

after sorting

10 20 30 */


public class Sorting{

       public static void main(String args[]){

            int arr[] = {20,10,30};

            System.out.println("before sorting :");

              for(int x:arr){

                   System.out.print("\t"+x);


              }


                 for(int i=0; i<arr.length; i++){//j=4

                       for(int j=i+1; j<arr.length; j++){

                             if(arr[i]>arr[j]){

                                 //arr[2]>arr[3]
                                 //40>30
                               
                                  int c;

                                  c = arr[i];

                                  arr[i] = arr[j];

                                  arr[j] = c;

                             }

                       }

                }


                 System.out.println("\n after sorting :\n");

              for(int x:arr){

                   System.out.print("\t"+x);

            }

       }

}