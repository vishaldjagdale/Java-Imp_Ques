public class reverseOnlyLetters {
    public static String reverseLetters(String s){
        char arr[]= s.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(!Character.isLetter(arr[left])){
                arr[left]++;

            }
            else if(!Character.isLetter(arr[right])){
                arr[right]--;
            }
            else{
                char temp=arr[left];
                arr[left++]=arr[right];
                arr[right--]=temp;
            }
        }
        return new String(arr);


    }
    public static void main(String[] args) {
        String s = "ab cd";
        System.out.println(reverseLetters(s));  // Output: "dc-ba"
    }
}
