class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, res=0;
        for(int x:nums)
        {
            if(sum<0)
                sum=0;
            sum=sum+x;
            res=Math.max(res,sum);
        }
        return res;
    }
}