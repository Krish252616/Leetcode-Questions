class Solution {
    public void sortColors(int[] nums) {
    int numofzeros=0;
    int numofones=0;
    int numoftwos=0;
    for(int ele : nums){
        if(ele == 0){
            numofzeros++;
        }
        else if(ele == 1){
            numofones++;
        } else {
            numoftwos++;
        }
            
        }
    int i=0;
    while (numofzeros > 0) {
        nums[i]=0;
        i++;
        numofzeros--;
        }
     while (numofones > 0) {
        nums[i]=1;
        i++;
        numofones--;
        }
    while (numoftwos > 0) {
        nums[i]=2;
        i++;
        numoftwos--;
        }

    }

}