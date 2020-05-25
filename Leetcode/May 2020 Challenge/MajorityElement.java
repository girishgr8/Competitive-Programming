class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting algorithm... 
        int index = 0, c = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[index]==nums[i])
                c++;
            else
                c--;
            if(c==0){
                index = i;
                c = 1;
            }
        }
        return nums[index];
    }
}