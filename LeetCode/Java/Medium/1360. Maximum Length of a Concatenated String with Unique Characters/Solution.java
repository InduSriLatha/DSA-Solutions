class Solution {
    public int maxLength(List<String> arr) {
        int n=arr.size();
        int result=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(arr.get(i));
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                if(!containsDuplicate(sb, arr.get(j)))
                {
                    sb.append(arr.get(j));
                }
                result=Math.max(result,sb.length());
            }
            result=Math.max(result,sb.length());
        }
        return result;
    }
    public static boolean containsDuplicate(StringBuilder sb, String s)
    {
        StringBuilder res=new StringBuilder(sb);
        res.append(s);
        HashSet<Character> hs=new HashSet<>();
        for(char c:res.toString().toCharArray())
        {
            if(hs.contains(c))
                return true;
            hs.add(c);
        }
        return false;
    }
}