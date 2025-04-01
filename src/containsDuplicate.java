class Solution {
    public boolean hasDuplicate(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[j] == nums[i]){
                    cnt++;
                }
            }
        }

        if (cnt > 0){
            return true;
        }
        else{
            return false;
        }
    }
}