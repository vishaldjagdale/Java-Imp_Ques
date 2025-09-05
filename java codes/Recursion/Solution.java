import java.util.*;

class Solution {

    public static void printS(int ind, List<Integer> ll, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int it : ll) {
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }

        // pick
        ll.add(arr[ind]);
        s += arr[ind];
        printS(ind + 1, ll, s, sum, arr, n);

        // backtrack
        s -= arr[ind];
        ll.remove(ll.size() - 1);

        // not pick
        printS(ind + 1, ll, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int sum = 2;
        printS(0, new ArrayList<>(), 0, sum, arr, n);
    }
}
