class Solution {
    public int maxFrequencyElements(int[] arr) {
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        Set<Integer> s=h.keySet();
        int count=0,ele=0;
		for(Integer x:s)
			if(count<h.get(x))
                count=h.get(x);
        for(Integer x:s)
            if(h.get(x)==count)
                ele++;
		return ele*count;
    }
}