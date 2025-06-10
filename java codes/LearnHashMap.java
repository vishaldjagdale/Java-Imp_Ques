import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Vish", "Vishal");
        map.put("P", "Prasad");
        map.put("A", "Aniket");
        map.put("d", "durva");
        System.out.println(map);
        System.out.println(map.get("Vish"));
        System.out.println(map.containsKey("P"));
        System.out.println(map.containsKey("M"));
        System.out.println(map.containsValue("Aniket"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.remove("Vish"));
        System.out.println(map.size());
        System.out.println(map);
        map.replace("P", "Pranav");
        System.out.println(map);

        // putting new keys without value
        map.put("Vicky", null);
        System.out.println(map);
        map.putIfAbsent("Vicky", "Vikrant tobre");
        System.out.println(map);
        map.remove("Vicky");
        System.out.println(map.getOrDefault("Vicky","Value removed"));

    }
}
