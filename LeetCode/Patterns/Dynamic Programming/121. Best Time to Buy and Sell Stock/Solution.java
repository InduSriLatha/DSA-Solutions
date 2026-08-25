class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxsofar=prices[n-1],maxprofit=0;
		for(int i=n-2;i>=0;i--)
		{
			if(prices[i]>maxsofar)
			{
				maxsofar=prices[i];
			}
			if(maxsofar-prices[i]>maxprofit)
				maxprofit=maxsofar-prices[i];
		}
		return maxprofit;
    }
}