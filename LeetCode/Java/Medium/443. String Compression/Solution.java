class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n<=1)
            return n;
        char present=chars[0];
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<n;i++)
        {
            if (chars[i] == present) {
                count++;
            } 
            else {
                sb.append(present);
                if (count > 1)
                    sb.append(count);
                present = chars[i];
                count = 1;
            }
        }
        sb.append(chars[n-1]);
        if(count>1)
            sb.append(count);
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}