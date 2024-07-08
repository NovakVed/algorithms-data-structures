import java.util.Map;
import java.util.HashMap;

public class VotingDictionary {
    public static void main(String[] args) {
        Map<String, Boolean> votingDictionary = new HashMap<>();
        System.out.println(votingDictionary.putIfAbsent("Aki", Boolean.TRUE));
        System.out.println(votingDictionary.putIfAbsent("Andela", Boolean.TRUE));
        System.out.println(votingDictionary.putIfAbsent("Vedran", Boolean.TRUE));
        if (votingDictionary.putIfAbsent("Vedran", Boolean.FALSE)) {
            System.out.println("Vedran: Already voted!");
        }
        System.out.println(votingDictionary);
    }
}
