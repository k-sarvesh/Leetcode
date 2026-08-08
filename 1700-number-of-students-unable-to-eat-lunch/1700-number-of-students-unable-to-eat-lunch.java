class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        int res = students.length;

        for(int i : students){
            if(i == 1){
                one++;
            }
            else{
                zero++;
            }
        }
        for(int i : sandwiches){
            if(i == 1 && one > 0){
                one--;
                res--;
            }
            else if(i == 0 && zero > 0){
                zero--;
                res--;
            }
            else{
                return res;
            }
        }
        return res;
    }
}