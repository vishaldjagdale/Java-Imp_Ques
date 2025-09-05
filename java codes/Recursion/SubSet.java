public class SubSet {
    public static void solve(int i, String s, String f) {
        // Base case: if we have considered all characters
        // in the string, print the formed subset

        if (i == s.length()) {
            System.out.print(f + " ");
            return;
        }
        // Recursive case: include the current character
        // in the subset and move to the next character,
        // or exclude it and move to the next character
        // This generates all possible subsets of the string
        solve(i + 1, s, f + s.charAt(i));
        solve(i + 1, s, f);
    }

    public static void main(String[] args) {
        String s = "abc";
        solve(0, s, "");
    }
}
