
class Solution3010 {
    public int minimumCost(int[] nums) {
        int i=0,j=0,min = Integer.MAX_VALUE;
        for(int k = 1;k<nums.length;k++){if(nums[k]<min){i=k;min = nums[k];}}
        min = Integer.MAX_VALUE;
        for(int k = 1; k<nums.length;k++){if(i!=k && nums[k]<min){j=k;min=nums[k];}}
        return nums[0]+nums[i]+nums[j];
    }
}