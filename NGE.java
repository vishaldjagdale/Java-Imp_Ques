    import java.util.*;

public class NGE {


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Map<Integer, Integer> ngeMap = new HashMap<>(); // Store next greater element for each num in nums2
        Stack<Integer> st = new Stack<>();

        // Finding next greater element for each num in nums2
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            ngeMap.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }

        // Preparing result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = ngeMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
    public static void main(String[] args) {
        NGE nge = new NGE();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = nge.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result)); // Output: [-1, 3, -1]
    }
}


