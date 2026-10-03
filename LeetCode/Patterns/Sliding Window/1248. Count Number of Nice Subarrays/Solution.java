class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int nums[], int k)
    {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int l=0, r=0;
        int count=0, res=0;
        while(r<nums.length)
        {
            if(nums[r]%2!=0)
                count++;
                //hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(count>k)
            {
                if(nums[l]%2!=0)
                    count--;
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return res;
    }
}