class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>k)
        {
            sb=divideReplace(sb,k);
        }
        return sb.toString();
    }
    public static StringBuilder divideReplace(StringBuilder sb, int k)
    {
        int count=0;
        int res=0;
        StringBuilder s=new StringBuilder();
        for(char c:sb.toString().toCharArray())
        {
            res += (c - '0');
            count++;
            if (count == k) {
                s.append(res);
                res = 0;
                count = 0;
            }
        }
        if (count > 0) {
            s.append(res);
        }
        return s;
    } 
}