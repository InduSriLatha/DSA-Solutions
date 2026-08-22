class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k>nums.length)
            return -1;
        int l=0, r=0;
        int sum=0;
        double res=Double.MIN_VALUE;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            if(r-l+1==k)
            {
                res=Math.max(res,(double)sum/k);
                sum=sum-nums[l];
                l++;
            }
            r++;
        }
        return res;
    }
}