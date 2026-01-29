//multiply odd inedex element 2 and add 10 to even index 

public class ArrayProcess{

   public static void main(String[]args){

 int[] arr= {1,2,3,4,5,6,7,8,9,10};
 
   System.out.print("Original ");

    for(int i=0; i<arr.length; i++){

 System.out.print(arr[i]+"  ");

 }
    for(int i=0; i<arr.length; i++){

         if(i%2==0){
         arr[i]+=10;

       }

        else{

           arr[i]*=2;
         }
     }


       System.out.print("modifiy ");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]+"  ");
        }
}
}