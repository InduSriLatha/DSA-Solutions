class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String[]> transac=new ArrayList<>();
        for(String s: transactions)
        {
            String w[]=s.split(",");
            transac.add(w);
        }
        List<Integer> idx=new ArrayList<>();
        List<String> invalid=new ArrayList<>();
        for(int i=0;i<transac.size();i++)
        {
            String a[]=transac.get(i);
            if(Integer.parseInt(a[2])>1000 && !idx.contains(i))
            {
                idx.add(i);
                invalid.add(transactions[i]);
            }
        }
        for(int i=0;i<transac.size()-1;i++)
        {
            String a1[]=transac.get(i);
            String a2[]=transac.get(i+1);
            int d=Math.abs(Integer.parseInt(a1[1])-Integer.parseInt(a2[1]));
            if(d<=60 && a1[0].equals(a2[0]) && !a1[3].equals(a2[3]))
            {
                if(!idx.contains(i))
                    invalid.add(transactions[i]);
                if(!idx.contains(i+1))
                    invalid.add(transactions[i+1]);
            }
        }
        return invalid;
    }
}