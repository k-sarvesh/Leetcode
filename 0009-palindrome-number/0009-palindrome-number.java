class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int result=0;
        while(x>0){
            result = result*10 + x%10;
            x=x/10;
        }
        if(result == org){
            return true;
        }
        return false;
    }
}
