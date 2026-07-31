class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        int maxnodel  =arr[0];
        int maxonedel=arr[0];
        int result=arr[0];
        for(int i=1;i<n;i++){
            int prenodel=maxnodel;
            maxnodel=Math.max(maxnodel+arr[i],arr[i]);
            maxonedel=Math.max(maxonedel+arr[i],prenodel);
            result=Math.max(result,Math.max(maxnodel,maxonedel));
        }
         return result;
    }
   
}