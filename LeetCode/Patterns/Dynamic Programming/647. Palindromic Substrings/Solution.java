class Solution {
    public int countSubstrings(String s) {
        if(s.length()==0)
            return 0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count+=expand(s,i,i);
            count+=expand(s,i,i+1);
        }
        return count;
    }
    int expand(String s, int l, int r)
    {
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            count++;
            l--;
            r++;
        }
        return count;
    }
}