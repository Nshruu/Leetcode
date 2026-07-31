class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int n=arr.length;
        int maxsum=arr[0];
        int minsum=arr[0];
         int max = arr[0];
        int min = arr[0];
        for(int i=1;i<n;i++){
            maxsum=Math.max(maxsum+arr[i],arr[i]);
            max = Math.max(max, maxsum);
            minsum=Math.min(minsum+arr[i],arr[i]);
             min = Math.min(min, minsum);

        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}