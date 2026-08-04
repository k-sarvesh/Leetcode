class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer , Integer> hp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < n ;i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i = min ; i <= max ; i++){
            hp.put(i , 0);
        }
        for(int i : nums){
            hp.put(i , hp.getOrDefault(i,0) - 1);
        }
        for(int i = min ; i <= max ; i++ ){
            if(hp.getOrDefault(i ,0) == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}