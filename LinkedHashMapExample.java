import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();

        lm.put(1, "A");
        lm.put(45, "B");
        lm.put(7, "AA");
        lm.put(4, "BA");
        lm.put(5, "XX");
        lm.put(4, "XX"); // value replace hogi

        System.out.println("LinkedHashMap: " + lm);

        System.out.println("All Keys: " + lm.keySet());
        System.out.println("All Values: " + lm.values());
        System.out.println("Entry Set: " + lm.entrySet());

        Set<Integer> keys = lm.keySet();
        for (int x : keys) {
            System.out.println("Key is " + x + " Value is " + lm.get(x));
        }

        lm.remove(7);
        System.out.println("After remove: " + lm);
    }
}