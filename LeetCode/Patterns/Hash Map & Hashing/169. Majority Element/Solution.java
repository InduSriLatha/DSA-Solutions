class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        if(n==1)
            return arr[0];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++)
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        Set<Integer> s=h.keySet();
        for(Integer x:s)
        {
            if(h.get(x)>n/2)
            {
                return x;
            }
        }
        return -1;
    }
}