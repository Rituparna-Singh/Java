class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2)
            return nums.length;
        int k = 1, temp = nums[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i] == temp)
                continue;
            nums[k] = nums[i];
            k++;
            temp = nums[i];
        }
        return k;
        
    }
}