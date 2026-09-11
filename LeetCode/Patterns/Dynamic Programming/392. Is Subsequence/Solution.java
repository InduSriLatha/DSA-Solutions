class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        int ind=0;
        for(char c:t.toCharArray())
        {
            if(c==s.charAt(ind))
                ind++;
        }
        return (ind==s.length());

    }
}