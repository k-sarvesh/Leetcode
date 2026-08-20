class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length ;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        for(int i : nums){
            if(arr1.size() == 0){
                arr1.add(i);
            }
            else if(arr2.size() == 0){
                arr2.add(i);
            }
            else{
                if(arr1.get(arr1.size()-1) > arr2.get(arr2.size()-1) ){
                    arr1.add(i);
                }
                else{
                    arr2.add(i);
                }
            }
        }
        arr1.addAll(arr2);
        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}