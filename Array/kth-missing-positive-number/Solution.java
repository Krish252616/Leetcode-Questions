class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int high=n-1;
        int low=0;
        while(low<=high){
            int mid=(low+high)/2;
            int correctno=mid+1;
            int missing=arr[mid]-correctno;
            if(missing>=k){
               high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high + 1 + k;
    }
}