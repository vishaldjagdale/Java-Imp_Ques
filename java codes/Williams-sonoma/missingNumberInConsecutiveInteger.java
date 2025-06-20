
public class missingNumberInConsecutiveInteger {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length+1;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;

        }
        return totalSum - actualSum;

    }
    public static void main(String[] args){
        // missingNumberInConsecutiveInteger msn= new missingNumberInConsecutiveInteger();
        int[] nums={1,2,3,4,6};
        int result=findMissingNumber(nums);
        System.out.println(result);
    }
}
