
import java.util.Collections;
import java.util.Vector;

public class ArrayAddTwo {
    public static void main(String[] args) {

        int[] arra = {2, 8, 6, 9, 3};
        int[] arrb= {2, 7, 6, 3};

        int i = arra.length - 1;   // a ka last index
        int j = arrb.length - 1;   // b ka last index
        int carry = 0;

        Vector<Integer> ans = new Vector<>();

        // Jab tak dono array ya carry bacha ho
        while (i >= 0 || j >= 0 || carry > 0) {

            int sum = carry;

            if (i >= 0) {
                sum += arra[i];
                i--;
            }

            if (j >= 0) {
                sum += arrb[j];
                j--;
            }

            ans.add(sum % 10);   // last digit store karo
            carry = sum / 10;    // carry update karo
        }

        Collections.reverse(ans);// Reverse kyunki  ulta add kiya tha

        System.out.println(ans);
    }
}
