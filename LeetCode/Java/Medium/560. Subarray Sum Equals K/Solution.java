class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length,count=0;
        int s=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
            if(hm.containsKey(s-k))
            {
                count=count+hm.get(s-k);
            }
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        return count;
    }
}