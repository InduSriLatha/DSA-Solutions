class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String[]> transac=new ArrayList<>();
        for(String s:transactions)
        {
            String arr[]=s.split(",");
            transac.add(arr);
        }
        
        List<Integer> idx=new ArrayList<>();
        List<String> invalid=new ArrayList<>();
        for(int i=0;i<transactions.length;i++)
        {
            if(idx.contains(i))
                continue;
            String a[]=transac.get(i);
            if(Integer.parseInt(a[2])>1000)
            {
                idx.add(i);
                invalid.add(transactions[i]);
            }
            for(int j=0;j<transactions.length;j++)
            {
                if(i==j)
                    continue;
                String a1[]=transac.get(i);
                String a2[]=transac.get(j);
                int d=Math.abs(Integer.parseInt(a1[1])-Integer.parseInt(a2[1]));
                if(d<=60 && a1[0].equals(a2[0]) && !a1[3].equals(a2[3]))
                {
                    if(!idx.contains(i))
                    {
                        idx.add(i);
                        invalid.add(transactions[i]);
                    }
                    if(!idx.contains(j))
                    {
                        idx.add(j);
                        invalid.add(transactions[j]);
                    }
                }
            }
        }
        return invalid;
    }
}