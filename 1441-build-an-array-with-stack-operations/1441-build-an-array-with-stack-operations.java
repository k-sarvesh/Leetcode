class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int num = 0;
        for(int i = 1; i <= n && num < target.length; i++){
            ans.add("Push");
            if(i == target[num]){
                num++;
            }    
            else{
                ans.add("Pop");
            }
        }
        return ans;
    }
}