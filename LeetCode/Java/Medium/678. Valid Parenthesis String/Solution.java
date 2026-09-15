class Solution {
    public boolean checkValidString(String s) {
        int cMax=0, cMin=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                cMax++;
                cMin++;
            }
            else if(c==')')
            {
                cMax--;
                cMin--;
            }
            else if(c=='*')
            {
                cMax++;
                cMin--;
            }
            if(cMax<0)  return false;
            cMin=Math.max(cMin,0);
        }
        return cMin==0;
    }
}