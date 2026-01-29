public class ArraySecondMax {
    public static void main(String[]args){
        int[] arr = {5,6,8,2,3,7};
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) {
             sec = max;//pura max second hogya   
             max = arr[i];
            }
            
                 else if(arr[i]>sec && arr[i]!=max){

                      sec= arr[i];

                 }

                }

                   System.out.println("Max: " + max);     // 8
                 System.out.println("Second Max: " + sec); // 7
                
}
 
     }