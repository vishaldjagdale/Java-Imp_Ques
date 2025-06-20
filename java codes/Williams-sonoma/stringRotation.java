public class stringRotation {
    public static boolean isRotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return (s1+s2).contains(s2);

    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";
        System.out.println(isRotation(s1, s2));
    }
}
