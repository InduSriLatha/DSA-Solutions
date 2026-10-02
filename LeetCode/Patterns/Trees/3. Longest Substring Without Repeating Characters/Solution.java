class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, res=0, len=0;
        HashMap<Character, Boolean> hm=new HashMap<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            while(hm.containsKey(ch))
            {
                hm.remove(s.charAt(l));
                l++;
            }
            hm.put(ch,true);
            r++;
            len=r-l;
            if(len>res)
                res=len;
        } 
        return res;
    }
}