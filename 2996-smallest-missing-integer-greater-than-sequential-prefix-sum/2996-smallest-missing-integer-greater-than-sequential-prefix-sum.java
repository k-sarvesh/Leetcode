class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length ;
        int sum = nums[0];

        for(int i = 1 ; i < n ; i++) {
            
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            }
            else{
                break;
            }
        }
        boolean found = true;
        while(found){
            found = false;
            for(int i : nums){
                if(i == sum){
                    found = true;
                    sum++;
                    break;
                }
            }
        }
        
        return sum;
    }
}