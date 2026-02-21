public class SelectionSortg {
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
            int min = Integer.MAX_VALUE;
            int mindex = -1;

            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
     Print(arr);
    }
   
}
