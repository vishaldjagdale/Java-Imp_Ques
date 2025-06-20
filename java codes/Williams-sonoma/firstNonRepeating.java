public class firstNonRepeating {
    public static String firstNonRepeatingCharInString(String str) {
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return String.valueOf(str.charAt(i));
            }
        }
        return "[]";
    }
    public static void main(String[] args) {
        String input = "hello hii how are you";
        String result = firstNonRepeatingCharInString(input);
        System.out.println(result);
    }
}
