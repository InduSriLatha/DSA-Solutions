class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(Integer x:nums)
        {
            h.put(x,h.getOrDefault(x,0)+1);
            if(h.get(x)>=2)
                return true;
        }
        return false;
    }
}