class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> al=new ArrayList<>(Arrays.asList(intervals));
        al.add(newInterval);
        List<int[]> res=new ArrayList<>();
        Collections.sort(al,(a,b)->a[0]-b[0]);
        for(int i=0;i<al.size();i++)
        {
            int a[]=al.get(i);
            if(res.isEmpty() || res.get(res.size()-1)[1]<a[0])
                res.add(a);
            else 
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],a[1]);
        }
        return res.toArray(new int[res.size()][]);
    }
}