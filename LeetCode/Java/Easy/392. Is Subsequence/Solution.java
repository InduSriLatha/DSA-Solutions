class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        int ind=0;
        for(int i=0;i<t.length() && ind<s.length();i++)
        {
            if(t.charAt(i)==s.charAt(ind))
                ind++;
        }
        return (ind==s.length());

    }
}