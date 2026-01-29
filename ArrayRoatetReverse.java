public class ArrayRoatetReverse {
    public static void main(String[]args){
        int[] arr = {0,1,2,3,4,5,6,};
        int n = arr.length;
        int d = 3;
         d = d%n;

        reverse(arr,0,n-d-1);   //0 to 3
        reverse(arr,n-d,n-1);  // 4 to 6
        reverse(arr,0,n-1);
        
        for (int elem : arr) {
            System.out.print(elem+"  ");
        }
    }
    static void reverse(int[]arr,int i , int j){
        while(i<j){
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
            i++;
            j--;
        
        }
    }
}
