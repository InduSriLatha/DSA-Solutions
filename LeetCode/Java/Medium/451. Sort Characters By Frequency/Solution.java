class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);

        List<Character> list=new ArrayList<>(hm.keySet());
        Collections.sort(list,(a,b)->{
            if(hm.get(a)!=hm.get(b))
                return hm.get(b)-hm.get(a);
            return a-b;
        });
        StringBuilder sb=new StringBuilder();
        for(Character c:list)
        {
            for(int i=0;i<hm.get(c);i++)
                sb.append(c);
        }
        return sb.toString();
        
        
    }
}