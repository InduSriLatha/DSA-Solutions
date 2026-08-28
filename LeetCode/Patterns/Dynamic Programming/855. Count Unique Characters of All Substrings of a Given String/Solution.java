class Solution {
    Map<Character,List<Integer>> hm;
    int[] peek;
    int n;
    public int uniqueLetterString(String s) {
        hm=new HashMap<>();
        peek=new int[26];
        n=s.length();

        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            hm.computeIfAbsent(c,x->new ArrayList<Integer>()).add(i);
        }
        long cur=0, ans=0;
        for(char c:hm.keySet())
        {
            hm.get(c).add(n);
            hm.get(c).add(n);
            cur+=get(c);
        }

        for(char c:s.toCharArray())
        {
            ans+=cur;
            long old=get(c);
            peek[c-'A']++;
            cur=cur+get(c)-old;
        }
        return (int)ans%1000000007;
    }
    public int get(char c)
    {
        List<Integer> al=hm.get(c);
        int i=peek[c-'A'];
        return al.get(i+1)-al.get(i);
    }
}