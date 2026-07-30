import java.util.*;

class Solution {
    public int[] beautifulArray(int n) {
        return helper(n);
    }

    private int[] helper(int n) {
        if (n == 1) return new int[]{1};

        List<Integer> result = new ArrayList<>();

        // Odd numbers
        for (int x : helper((n + 1) / 2)) {
            result.add(2 * x - 1);
        }

        // Even numbers
        for (int x : helper(n / 2)) {
            result.add(2 * x);
        }

        // Convert List to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
