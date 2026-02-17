import java.util.TreeMap;
import java.util.Set;

public class TreemapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(1, "A");
        tm.put(45, "B");
        tm.put(7, "AA");
        tm.put(4, "BA");
        tm.put(5, "XX");
        tm.put(4, "XX"); // value replace hogi

        System.out.println("TreeMap: " + tm);

        System.out.println("All Keys: " + tm.keySet());
        System.out.println("All Values: " + tm.values());
        System.out.println("Entry Set: " + tm.entrySet());

        Set<Integer> keys = tm.keySet();

        for (int x : keys) {
            System.out.println("Key is " + x + " Value is " + tm.get(x));
        }

        tm.remove(7);
        System.out.println("After remove: " + tm);
    }
}