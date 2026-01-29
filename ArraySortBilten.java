
import java.util.Arrays;
public class ArraySortBilten{

    public static void main(String[]args){
     //sort ascending order
   
      int[] arr = {9,5,8,6,2,1};

System.out.println("original array");
      print(arr);

      Arrays.sort(arr);

  System.out.println("after array");

       print(arr);


 }

    public static void print(int[]arr){
     
       for(int i=0; i<arr.length; i++){

          System.out.print(arr[i]+"  ");
    }
       System.out.println();
  }
}
