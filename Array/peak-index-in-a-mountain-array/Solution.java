class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int peak=(low+high)/2;
            if(arr[peak]<arr[peak+1]){
                low=peak+1;
            }
            else if(arr[peak]<arr[peak-1]){
                high=peak-1;
            }
            else{
                return peak;
            }
        }
        return -1; 
    }
}