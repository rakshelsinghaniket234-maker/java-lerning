//print minimum element of arry
public class ArrayMinimum{

    public static void main(String[]args){

        int[] arr = {45,54,88,65,98};

 int min = arr[0];

      for(int i=0; i<arr.length; i++){
          if(arr[i]<min){
               min=arr[i];

         }


            }
System.out.println(min);


       
   }
}