class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int pFreq[]=new int[26];
        int w[]=new int[26];
        for(int i=0;i<p.length();i++)
            pFreq[p.charAt(i)-'a']++;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            w[ch-'a']++;
            if(r-l+1>p.length())
            {
                w[s.charAt(l)-'a']--;
                l++;
            }   
            if(r-l+1==p.length() && Arrays.equals(pFreq,w))
                res.add(l);
        }
        return res;
    }
}