class Solution {
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int ele : nums){
            if(ele==max1 || ele==max2 || ele==max3)
            continue;

            if(ele>max1){
                max3=max2;
                max2=max1;
                max1=ele;
            }
            else if(ele>max2){
                max3=max2;
                max2=ele;
            }
            else if(ele>max3){
                max3=ele;
            }
        }
        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }
        return(int) max3;
    }
}