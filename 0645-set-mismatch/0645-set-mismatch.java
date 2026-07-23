class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 1; i<= nums.length ; i++){
            hm.put(i,0);
        }

        for(int i : nums){
            hm.put(i , hm.get(i) - 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (hm.get(i) == -2) {
                ans[0] = i;
            } else if (hm.get(i) == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}