class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max = ans;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                if(ans > max){
                    max = ans;
                }
                ans = 0;
            }
            else{
                ans++;
            }
        }
        return max > ans ? max : ans;
    }
}