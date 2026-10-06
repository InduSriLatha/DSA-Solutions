class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int L[]=new int[n];
        int R[]=new int[n];
        L[0]=1;
        R[n-1]=1;
        for(int i=1;i<n;i++)
        {
            if(ratings[i-1]>=ratings[i])
                L[i]=1;
            else
                L[i]=L[i-1]+1;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]<=ratings[i+1])
                R[i]=1;
            else
                R[i]=R[i+1]+1;
        }
        int sum=0;
        for(int i=0;i<n;i++)
            sum=sum+Math.max(L[i],R[i]);
        return sum;
    }
}