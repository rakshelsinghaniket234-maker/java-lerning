//1,4,45,6,10,8 sum = 16
public class SumTwoPair {
    public static void main(String[]args){
        int[] arr = {1,4,45,6,10,8};
        int n = arr.length;
        int target = 16;
        for(int i= 0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("pair" + arr[i] +" "+ arr[j]);
                }
            }
        }
    }
}
