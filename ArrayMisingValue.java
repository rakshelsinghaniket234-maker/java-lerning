public class ArrayMisingValue {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1;//1 missin raheagatb 2 missing rahega to 2 +2
        int sum = n*(n+1)/2;
        int arrsum = 0;
        
        for (int elem : arr) {
            arrsum+=elem;
        }
        int missing = sum - arrsum;
        System.out.print(missing);
    }
}