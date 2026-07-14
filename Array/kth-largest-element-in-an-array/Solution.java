class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        System.out.print(nums[n-k]);
        return nums[n-k];
    }
}
    