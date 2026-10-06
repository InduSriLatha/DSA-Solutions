class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        List<Integer> res=new ArrayList<>();
        Map<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            hm.put(c,i);
        }

        int prev=-1, max=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            max=Math.max(max,hm.get(c));
            if(max==i)
            {
                res.add(max-prev);
                prev=max;
            }
        }
        return res;
    }
}