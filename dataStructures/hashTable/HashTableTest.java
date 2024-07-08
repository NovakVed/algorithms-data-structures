import java.util.Map;
import java.util.HashMap;

public class HashTableTest {
    public static void main(String[] args) {
        // String s = args[0];
        // System.out.println(s.hashCode());
        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("apple", 1.00);
        hashMap.put("apple", 1.24);
        hashMap.put("milk", 1.99);
        hashMap.put("avocado", 0.99);
        hashMap.put("FB", 0.99);
        hashMap.put("Ea", 1.99);

        System.out.println(hashMap);
        // System.out.println(hashTable.get(args[0]));
    }
}
