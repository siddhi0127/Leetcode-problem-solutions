class Solution {
    public int[] twoSum(int[] a, int target) {
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=a[i]+a[j];
                if(sum==target){
                    return i,j;
                }
            }
        }
    }
}
