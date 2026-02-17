public class ArrayLinearSearchs {
    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 65, 44, 77};
        int target = 44;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target found at index " + i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Target missing in array");
        }
    }
}
