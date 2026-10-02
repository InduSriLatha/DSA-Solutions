class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String c:words)
            hm.put(c,hm.getOrDefault(c,0)+1);

        List<String> list=new ArrayList<>(hm.keySet());
        Collections.sort(list,(a,b)->{
            if(hm.get(a)!=hm.get(b))
                return hm.get(b)-hm.get(a);
            return a.compareTo(b);
        });
        List<String> res=new ArrayList<>();
        for(int i=0;i<k&&i<list.size();i++)
        {
            res.add(list.get(i));
        }
        return res;
    }
}