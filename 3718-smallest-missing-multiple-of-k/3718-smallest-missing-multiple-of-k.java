class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean found = false;
        int idx = 1;
        while(!found){
            int val = k*idx;
            boolean isContain  = false;
            for(int i : nums){
                if(val == i){
                    isContain = true;
                }
            }
            idx++;
            if(!isContain){

                return val;
            }
        }
        return 0;
    }
}