public class ArrayTwoSum {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 8, 6};
        int target = 5;
        boolean found = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int sum = arr[i] + arr[j];

                if (sum == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("pair nahi mila");
        }
    }
}