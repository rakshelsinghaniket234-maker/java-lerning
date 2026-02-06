import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayList<Object> al = new ArrayList<>();

        al.add(10);
        al.add(2.50f);
        al.add("hello");
        al.add(true);
        al.add("A");

        
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        System.out.print("Print elements using for-each loop");

        // Using for-each loop
        for (Object x : al) {
            System.out.print(x + " ");
        }

    }
}
