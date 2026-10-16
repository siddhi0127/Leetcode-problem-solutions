class Solution {
    public void merge(int[] nums, int m, int[] nums2, int n) {
        int k=m+n;
        for(int i=0;i<n;i++){
            nums[m+i]=nums2[i];
        }

        for(int i=0;i<k-1;i++){
            for(int j=0;j<k-1-i;j++){
               if(nums[j]>nums[j+1]){
                int t=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=t;
               }
            }
        }
    }
}
