class Solution {
    public List<String> letterCombinations(String digits) {
        String w[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backtrack(digits, res, sb, 0, w);
        return res;
    }
    public void backtrack(String digits, List<String> res, StringBuilder comb, int idx, String w[])
    {
        if(idx==digits.length())
        {
            res.add(comb.toString());
            return;
        }
        String letters=w[digits.charAt(idx)-'0'];
        for(char letter: letters.toCharArray())
        {
            comb.append(letter);
            backtrack(digits, res, comb, idx+1, w);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}