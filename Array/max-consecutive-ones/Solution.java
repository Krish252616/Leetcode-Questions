class Solution {
    static{
        for (int i=0;i<500;i+=1){
            findMaxConsecutiveOnes(new int [0]);
        }
    }
    public static int findMaxConsecutiveOnes(int[] a) {
        // int count=0;
        // int maxi=0;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==1){
        //         count++;
        //         maxi=Math.max(maxi,count);
        //     }
        //     else{
        //         count =0; 
        //     }
        // }
        // return maxi;
        int sum=0;
        int n=a.length;
        if (n==0) return 0;
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (a[i]==1){
                sum+=1;
            }else{
                ans=Math.max(sum,ans);
                sum=0;
            }
        }
        ans=Math.max(ans,sum);
        return ans;
}
}