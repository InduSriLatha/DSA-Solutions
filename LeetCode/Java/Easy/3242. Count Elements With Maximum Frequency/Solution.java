class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums)
            hm.put(x,hm.getOrDefault(x,0)+1);
        int max=-1;
        for(int x:hm.keySet())
        {
            if(hm.get(x)>max)
                max=hm.get(x);
        }
        int count=0;
        for(int x:hm.keySet())
        {
            if(hm.get(x)==max)
                count=count+hm.get(x);
        }
        return count;
    }
}