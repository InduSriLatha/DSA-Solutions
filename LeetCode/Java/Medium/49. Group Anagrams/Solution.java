import java.util.Collections;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s: strs)
        {
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String st=new String(a);
            if(hm.containsKey(st))
                hm.get(st).add(s);
            else
            {
                List<String> al=new ArrayList<>();
                al.add(s);
                hm.put(st, al);
            }
        }
        return new ArrayList<>(hm.values());

    }
}