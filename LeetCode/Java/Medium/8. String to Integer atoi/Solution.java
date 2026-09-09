class Solution {
    public int myAtoi(String s) {
        int i=0;
        int len=s.length();
        while(i<len && s.charAt(i)==' ')
            i++;
        int sign =1;
        if(i<len && (s.charAt(i)=='+'|| s.charAt(i)=='-'))
        {
            sign=(s.charAt(i)=='+')?1:-1;
            i++;
        }
        while(i<len && s.charAt(i)=='0')
            i++;
        return helper(sign,0,s,i);
    }
    public int helper(int sign, long num, String s, int i)
    {
        final int min_val= -2147483648;
        final int max_val = 2147483647;

        if(i>=s.length() || !Character.isDigit(s.charAt(i)))
            return (int)(num*sign);
        num=num*10+(s.charAt(i)-'0');
        if(num*sign<min_val)    return min_val;
        if(num*sign>max_val)    return max_val;
        return helper(sign, num,s,i+1);
    }
}