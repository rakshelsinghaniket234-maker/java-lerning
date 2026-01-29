//print maxmimum element of arry
public class ArrayMaximum{

    public static void main(String[]args){

        int[] arr = {45,54,88,65,98};

 int max = arr[0];

      for(int i=0; i<arr.length; i++){
          if(arr[i]>max){
               max=arr[i];

         }


            }
System.out.println(max);


       
   }
}