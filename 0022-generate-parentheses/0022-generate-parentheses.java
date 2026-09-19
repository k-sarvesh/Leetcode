class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res , 0 , 0 ,"" , n);
        return res;
    }
    static void backtrack(List<String> rec , int left , int right , String s , int n){
        if(s.length() == n*2){
            rec.add(s);
            return ;
        }

        if(left < n){
            backtrack(rec , left + 1 , right ,s + "(" , n);
        }
        if(right < left){
            backtrack(rec , left , right + 1 , s+")" , n);
        }
    }
}