class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        recursion("",n,0,0,res);
        return res;
    }
    public static void recursion(String cur, int n, int open, int close, List<String> res)
    {
        if(cur.length()==n*2)
        {
            res.add(cur);
            return;
        }
        if(open<n)
            recursion(cur+"(",n,open+1,close,res);
        if(close<open)
            recursion(cur+")",n,open,close+1,res);
    }
}