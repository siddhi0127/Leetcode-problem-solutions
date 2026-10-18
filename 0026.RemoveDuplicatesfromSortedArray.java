class Solution {
    public int removeDuplicates(int[] arr) {
        int k=1;
        int n=arr.length;

        if(n==0){return 0;}

        for(int i=1;i<n;i++){
            if(arr[i]!=arr[k-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
