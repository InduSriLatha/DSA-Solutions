class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            int index=s.lastIndexOf(c);
            for(int j=i+1;j<=index;j++)
            {
                if(s.lastIndexOf(s.charAt(j))>index)
                    index=s.lastIndexOf(s.charAt(j));
            }
            res.add(index-i+1);
            i=index;
        }  
        return res;
    }
}