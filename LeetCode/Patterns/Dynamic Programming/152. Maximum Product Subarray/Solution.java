class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE;
        for(int x:nums)
            res=Math.max(res,x);
        int curMax=1, curMin=1;
        for(int x:nums)
        {
            int temp=curMax*x;
            curMax=Math.max(temp,Math.max(curMin*x,x));
            curMin=Math.min(temp,Math.min(curMin*x,x));

            res=Math.max(res,curMax);
        }
        return res;
    }
}