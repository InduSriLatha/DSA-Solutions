class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(hm.keySet());
        Collections.sort(list,(a,b)->{
            if(hm.get(a)!=hm.get(b))  return hm.get(b)-hm.get(a);
            return a-b;
        });

        StringBuilder res=new StringBuilder();
        for(char ch:list)
        {
            for(int j=0;j<hm.get(ch);j++)
                res.append(ch);
        }
        return res.toString();
    }
}
class Pair
{
    int f;
    char ch;
    Pair(int f,char ch)
    {
        this.f=f;
        this.ch=ch;
    }
}