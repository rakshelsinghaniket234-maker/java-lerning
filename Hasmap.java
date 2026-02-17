import java.util.HashMap;
import java.util.Set;

public class Hasmap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "A");
        hm.put(45, "B");
        hm.put(7, "AA");
        hm.put(4, "BA");
        hm.put(5, "XX");
        hm.put(4, "XX"); // value replace hogi

        System.out.println("HashMap: " + hm);

        System.out.println("All Keys: " + hm.keySet());
        System.out.println("All Values: " + hm.values());
        System.out.println("Entry Set: " + hm.entrySet());

        Set<Integer> keys = hm.keySet();

        for (int x : keys) {
            System.out.println("Key is " + x + " Value is " + hm.get(x));
        }

        hm.remove(7);
        System.out.println("After remove: " + hm);
    }
}