import java.util.*;
public class kthLargestNumber {
    public static int findKthLargest(int[] nums,int target){
        PriorityQueue<Integer>minHeap= new PriorityQueue<>();
        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size() > target){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));  // Output: 5
    }
}
