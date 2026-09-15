class Solution {
    public int candy(int[] a) {
        int n=a.length;
        int L[]=new int[n];
		int R[]=new int[n];
		int res=0;
		L[0]=1;
		for(int i=1;i<n;i++)
		{
			if(a[i-1]>=a[i])
				L[i]=1;
			else
				L[i]=L[i-1]+1;
		}
		R[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i+1]>=a[i])
				R[i]=1;
			else
				R[i]=R[i+1]+1;
		}
		for(int i=0;i<n;i++)
			res=res+Math.max(L[i],R[i]);
		return res;
    }
}