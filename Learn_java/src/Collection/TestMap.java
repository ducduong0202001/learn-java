package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "duc");
        map.put(2, "van");
        map.put(3, "pham");

        // Duyet theo key
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        // Duyet theo value
        System.out.println("Mang duyet theo Value");
        for (String str : map.values()) {
            System.out.println(str);
        }
        // Duyet theo key/value
        System.out.println("Mang duyet theo key/Value");
        for (Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry);
        }


        //Lay key
        System.out.println(map.keySet());
        //Lay value
        System.out.println(map.values());

        //Xoa phan tu trong map
        map.remove(1);
        System.out.println("map sau khi xoa");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //Update 1 phan tu trong Map
        map.replace(2,"pham");
        System.out.println("map sau khi update");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
