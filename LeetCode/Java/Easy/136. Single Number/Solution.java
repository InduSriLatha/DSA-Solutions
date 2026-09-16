class Solution {
    public int singleNumber(int[] arr) {
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        Set<Integer> s=h.keySet();
        for(Integer x:s)
            if(h.get(x)==1)
                return x;
        return 0;
    }
}