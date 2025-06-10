import java.util.HashSet;
public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(7);
        set.add(4);
        set.add(0);
        System.out.println(set);
        // System.out.println(set.contains(2));
        // set.remove(1);
        // System.out.println(set);
        // set.clear();
        // System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
