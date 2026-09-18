class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long ans ;
        long even = (n+1)/2;
        long odd = n/2;

        ans = power(5 , even) * power(4 , odd) % MOD;

        return (int) ans;
    }
    static long power(long base , long exponent){
        long result = 1;
        while(exponent > 0) {
            if(exponent % 2 == 1){
                result = (result * base) % MOD;
            }
            base =( base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}