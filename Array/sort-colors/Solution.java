class Solution {
    public void sortColors(int[] nums) {
        int numoftwo=0;
        int numofzeros=0;
        int numofones=0;
        int n=nums.length;
        for(int ele : nums){
            if(ele==0) numofzeros++;
            else if(ele==1) numofones++;
            else numoftwo++;
        }
        int i=0;
        while(numofzeros > 0){
            nums[i]=0;
            numofzeros--;
            i++;
        }
        while(numofones > 0){
            nums[i]=1;
            numofones--;
            i++;
        }
        while(numoftwo > 0){
            nums[i]=2;
            numoftwo--;
            i++;
        }
    }
}