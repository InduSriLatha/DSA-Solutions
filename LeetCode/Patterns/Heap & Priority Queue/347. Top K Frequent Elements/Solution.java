class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        List<Map.Entry<Integer,Integer>> al=new ArrayList<>(hm.entrySet());
        Collections.sort(al,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++)
        {
            res[i]=al.get(i).getKey();
        }
        return res;
    }
}