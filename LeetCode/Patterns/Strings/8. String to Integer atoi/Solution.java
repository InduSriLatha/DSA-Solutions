class Solution {
    public int myAtoi(String s) {
        int i=0, len=s.length();
        while(i<len && s.charAt(i)==' ')
            i++;
        int sign=1;
        if(i<len && (s.charAt(i)=='+' || s.charAt(i)=='-'))
        {
            sign=(s.charAt(i)=='+')?1:-1;
            i++;
        }
        while(i<len && s.charAt(i)=='0')
            i++;
        return helper(i,s,0,sign);
        
    }
    public int helper(int i, String s, long num, int sign)
    {
        final int min_value=Integer.MIN_VALUE;
        final int max_value=Integer.MAX_VALUE;

        if(i>=s.length() || !Character.isDigit(s.charAt(i)))
            return (int)(num*sign);
        num=num*10+(s.charAt(i)-'0');
        if(num*sign<min_value)   return min_value;
        if(num*sign>max_value)   return max_value;
        return helper(i+1,s,num,sign);
    }
}