class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean flag = false;
        int[] tar = new int[2]; 
        for(int i=0;i<nums.length - 1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    tar[0] = i;
                    tar[1] = j;
                    break;
                }
            }
            if(flag)
                break;
        }
        return tar;
    }
}