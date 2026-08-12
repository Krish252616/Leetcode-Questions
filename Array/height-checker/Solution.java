class Solution{
    public int heightChecker(int[] heights){
        int n=heights.length;
        int[] sorted=new int[n];
        for(int i=0;i<n;i++){
            sorted[i]=heights[i];
            }
        Arrays.sort(sorted);
        int numberofindices=0;
        for(int i=0;i<n;i++){
            if(heights[i] != sorted[i]){
                numberofindices++;
            }
        }
        return numberofindices;
    }
}