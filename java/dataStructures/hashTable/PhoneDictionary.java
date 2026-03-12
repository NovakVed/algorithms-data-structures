import java.util.Map;

public class PhoneDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionary = Map.of(
                "Andela", "00000000000",
                "Vedran", "111111111",
                "Aki", "22222222222");

        System.out.println(dictionary.get("Vedran"));
    }
}
