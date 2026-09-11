class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x: nums)
        {
            hs.add(x);
        }
        int res=-1, count, val;
        for(int x:nums)
        {
            if(!hs.contains(x-1))
            {
                count=1;
                val=x;
                while(hs.contains(val+1))
                {
                    count++;
                    val=val+1;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
}