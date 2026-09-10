class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            sb.append((c-'a')+1);
        }
        for(int i=1;i<=k;i++)
        {
            sb=transform(sb,k);
        }
        return Integer.parseInt(sb.toString());
    }
    public static StringBuilder transform(StringBuilder sb, int k)
    {
        int res=0;
        for(char c:sb.toString().toCharArray())
        {
            res=res+(c-'0');
        }
        return new StringBuilder(String.valueOf(res));
    }
}