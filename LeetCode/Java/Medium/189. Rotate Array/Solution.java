class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n) k=k%n;
        if(k==0)
            return;
        int arr[]=new int[n];
        int ind=0;
        for(int i=n-k;i<n;i++)
        {
            arr[ind]=nums[i];
            ind++;
        }
        for(int i=0;i<=k && ind<n ;i++)
        {
            arr[ind]=nums[i];
            ind++;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}