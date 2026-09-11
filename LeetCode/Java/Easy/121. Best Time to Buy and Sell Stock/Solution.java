class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        if(n<=1)
            return 0;
        int max=prices[n-1];
        int res=0;
        for(int i=n-2;i>=0;i--)
        {
            if(max-prices[i]>res)
            {
                res=max-prices[i];
            }
            if(prices[i]>max)
                max=prices[i];
        }
        return res;
    }
}