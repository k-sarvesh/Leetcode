class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k = 0;
        int length = n*2;
        int[] ans = new int[length];

        while(j<length){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            i++;
            k+=2;
            j++;
        }
        return ans;
    }
}