class Solution {
    public String longestPalindrome(String s) {
        int start=0, end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=expand(i,i,s);
            int len2=expand(i,i+1,s);

            int len=Math.max(len1,len2);
            if(len>end-start+1)
            {
                end=i+(len)/2;
                start=i-(len-1)/2;
            }
        }
        return s.substring(start, end+1);
    }
    public static int expand(int l, int r, String s)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}