class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int l=0, r=0;
        while(r<s.length())
        {
            if(r-l+1==p.length())
            {
                if(isAnagram(s.substring(l,r+1),p))
                    res.add(l);
                l++;
            }
            r++;
        }
        return res;
    }
    static boolean isAnagram(String s, String p)
    {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(char c: s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c: p.toCharArray())
        {
            if(!hm.containsKey(c))
                return false;
            hm.put(c, hm.get(c)-1);
            if(hm.get(c)==0)
                hm.remove(c);
        }
        if(hm.size()==0)
            return true;
        return false;
    }
}