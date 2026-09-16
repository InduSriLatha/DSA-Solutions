class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
            reverse(nums,0);
        else
        {
            for(int i=n-1;i>idx;i--)
            {
                if(nums[idx]<nums[i])
                {
                    int temp=nums[idx];
                    nums[idx]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums,idx+1);
        }
    }
    public void reverse(int nums[], int idx)
    {
        int n=nums.length;
        int i=idx, j=n-1;
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}