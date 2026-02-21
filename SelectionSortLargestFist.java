public class SelectionSortLargestFist {
    
    public static void Print(int[]arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,9,6,7,1,2};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            
            int maxndex = 0;
//largest elemnt find ke liye hai 

            for(int j=1; j<n-i; j++){
                if(arr[j]>arr[maxndex]){
                   
                    maxndex= j;
                }
            }
            //swap
            int temp = arr[maxndex];
            arr[maxndex] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
     Print(arr);
    }
   


}
