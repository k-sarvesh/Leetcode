class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length ;
        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            hm.put(i , 0);
        }
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i , 0) - 1);
        }

        for(int i = 1 ; i <= n ; i++){
            if(hm.get(i) == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}