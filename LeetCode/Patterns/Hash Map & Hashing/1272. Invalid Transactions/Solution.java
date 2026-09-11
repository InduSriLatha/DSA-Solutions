class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String> res=new ArrayList<>();

        List<List<String>> transac=new ArrayList<>();
        for(String s:transactions)
        {
            List<String> t=Arrays.asList(s.split(","));
            transac.add(t);
        }
        List<Integer> ind=new ArrayList<>();
        for(int i=0;i<transac.size();i++)
        {
            if(ind.contains(i))
                continue;
            if(Integer.parseInt(transac.get(i).get(2))>1000)
            {
                res.add(transactions[i]);
                ind.add(i);
            }
            for(int j=0;j<transac.size();j++)
            {
                if(transac.get(i).get(0).equals(transac.get(j).get(0)) && i!=j)
                {
                    int d1=Integer.parseInt(transac.get(i).get(1));
                    int d2=Integer.parseInt(transac.get(j).get(1));
                    if(Math.abs(d1-d2)<=60 && !transac.get(i).get(3).equals(transac.get(j).get(3)))
                    {
                        if(!ind.contains(i))
                        {
                            res.add(transactions[i]);
                            ind.add(i);
                        }
                        if(!ind.contains(j))
                        {
                            res.add(transactions[j]);
                            ind.add(j);
                        }
                    }
                }
            }
        }
        return res;
    }
}