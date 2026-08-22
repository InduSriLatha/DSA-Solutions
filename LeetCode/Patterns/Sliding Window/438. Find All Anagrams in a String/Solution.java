class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int pFreq[]=new int[26];
        int wFreq[]=new int[26];
        for(char c:p.toCharArray())
            pFreq[c-'a']++;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            wFreq[s.charAt(r)-'a']++;
            if(r-l+1>p.length())
            {
                wFreq[s.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==p.length() && Arrays.equals(pFreq,wFreq))
                res.add(l);
        }
        return res;
    }
}