class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return power(x , (int)N);
    }
    static double power(double x , int n){
        if(n == 0) return 1;
        if(n == 1) return x;

        double a = power(x , n/2);
        if(n%2 == 0){
            return a * a;
        }
        else {
            return x*a*a;
        }
    }
}