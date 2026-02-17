import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Hastable {
    public static void main(String[] args) {
        Dictionary<Integer,String>hm = new Hashtable<>();
        hm.put(1, "Ajv");
        hm.put(12, "Ajhchiad");
        hm.put(15, "Akv");
        hm.put(11, "Afg");
        hm.put(18, "Af");
        hm.put(10, "A");
        System.out.println(" "+hm);
        Enumeration<Integer> en = hm.keys();
        while (en.hasMoreElements()) {
            Integer k = en.nextElement();
            System.out.println("Keys is : "+k+ "value : "+hm.get(k));
        }
    }
}
