public class missingNumber {
    public static int findMissingNumber(int[] arr){
        int n=arr.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n;i++){
            xor1^=arr[i];
            xor2^=i;
        }
        xor2^=n;
        return xor1^xor2;

    }
    // or we can simply sort the array and then check for the missing number
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5};
        int result=findMissingNumber(arr);
        System.out.println(result);
    }
}
