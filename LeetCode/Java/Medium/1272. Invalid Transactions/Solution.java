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
        for(int j=0;j<transac.size();j++)
        {
            if(idx.contains(j))
                continue;
            String a[]=transac.get(j);
            if(Integer.parseInt(a[2])>1000)
            {
                idx.add(j);
                invalid.add(transactions[j]);
            }
            for(int i=0;i<transac.size();i++)
            {
                String a1[]=transac.get(i);
                String a2[]=transac.get(j);
                int d=Math.abs(Integer.parseInt(a1[1])-Integer.parseInt(a2[1]));
                if(d<=60 && a1[0].equals(a2[0]) && !a1[3].equals(a2[3]))
                {
                    if(!idx.contains(i))
                    {
                        invalid.add(transactions[i]);
                        idx.add(i);
                    }
                    if(!idx.contains(j))
                    {
                        invalid.add(transactions[j]);
                        idx.add(j);
                    }
                }
            }
        }
        return invalid;
    }
}