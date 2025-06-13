public class reverseWordString {
    public static String reverseWords(String str) {
        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();

        for (String s : words) {
            sb.append((new StringBuilder(s).reverse().toString())).append(" ");

        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello hii how are you";
        String result = reverseWords(input);
        System.out.println(result);
    }
}
