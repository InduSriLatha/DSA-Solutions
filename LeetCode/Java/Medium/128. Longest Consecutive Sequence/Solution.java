class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
            h.add(i);
        int count=0, x=0, l=1;
        for(int i:nums)
        {
            if(!h.contains(i-1))
            {
                count=1;
                x=i;
                while(h.contains(x+1))
                {
                    x=x+1;
                    count++;
                }
            }
            l=Math.max(l,count);
        }
        return l;
    }
}