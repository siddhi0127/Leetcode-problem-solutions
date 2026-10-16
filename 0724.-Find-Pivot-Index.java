class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int totalSum=sum;

        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            else{
                leftSum+=nums[i];
            }
        }
        return -1;
    }
}
