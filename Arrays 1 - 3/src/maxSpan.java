public class maxSpan {
    public int maxSpan(int[] nums) {
        int largestSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > largestSpan) {
                        largestSpan = span;
                    }
                }
            }
        }

        return largestSpan;
    }
}
