class Solution {
    public int compress(char[] chars) {

        if(chars.length<=1)
            return chars.length;
        StringBuilder sb=new StringBuilder();
        char present=chars[0];
        int count=0;
        for(char c:chars)
        {
            if(c==present)
                count++;
            else
            {
                sb.append(present);
                if(count>1)
                    sb.append(count);
                count=1;
                present=c;
            }
        }
        sb.append(present);
        if(count>1)
            sb.append(count);
        for(int i=0;i<sb.length();i++)
            chars[i]=sb.charAt(i);
        return sb.length();
        
    }
}