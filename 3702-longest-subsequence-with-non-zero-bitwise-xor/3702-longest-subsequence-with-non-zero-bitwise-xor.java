class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length ;
        int count = 0;
        boolean zero = true;

        for(int i : nums){
            count ^= i;
            if(i != 0){
                zero = false;
            }
        }
        if(zero) return 0;
        if(count!=0) return n;
        
        return n -1;
    }
}