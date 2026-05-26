
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean yes = false;
        for(int i=nums.length -1; i > 0; i--){
            if(nums[i] == nums[i-1]) {
                yes = true;
                break;
            }
        }

        return yes;
    }
}