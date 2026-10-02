class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(0,0,n,res,"");
        return res;
    }
    public static void helper(int open, int close, int n, List<String> res,String curr)
    {
        if(curr.length()==n*2)
        {
            res.add(curr);
            return;
        }
        if(open<n)
            helper(open+1,close,n,res,curr+'(');
        if(close<open)
            helper(open, close+1, n, res, curr+')');

    }
}