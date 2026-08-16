class Solution {
    public boolean stoneGameIX(int[] stones) {
        int n = stones.length;
        int[] count = {0,0,0};

        for(int i : stones){
            count[i%3] += 1;
        }
        int c0 = count[0];
        int c1 = count[1];
        int c2 = count[2];

        if(c0 % 2 == 0){
            return c1 >=1 && c2 >= 1;
        }
        return Math.abs(c1-c2) > 2;
    }
}