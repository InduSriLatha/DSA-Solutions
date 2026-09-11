class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0, r=0, n=nums.length;
        double res=-Double.MAX_VALUE, sum=0.0;
        while(r<n)
        {
            sum=sum+nums[r];
            if(r-l+1>k)
            {
                sum=sum-nums[l];
                l++;
            }
            if(r-l+1==k)
                res=Math.max(res,sum/k);
            r++;
        }
        return res;
    }
}