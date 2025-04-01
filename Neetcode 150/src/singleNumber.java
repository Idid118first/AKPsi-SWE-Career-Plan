class Solution {
    public int singleNumber(int[] nums) {
        int compare = 0;

        for (int num : nums) {
            compare ^= num;
        }

        return compare;
    }
}
