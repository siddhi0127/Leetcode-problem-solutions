class Solution {
    public int majorityElement(int[] nums) {
       int maj_ele=nums[0];
       int cnt=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]==maj_ele){
            cnt++;
        }
        else{
            cnt--;
        }

        if(cnt==0){
            maj_ele=nums[i];
            cnt=1;
        }
       }
       return maj_ele;
    }
}
