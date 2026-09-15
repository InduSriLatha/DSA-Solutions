class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(intervals,(a, b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(res.isEmpty() || res.get(res.size()-1).get(1)<start)
            {
                res.add(Arrays.asList(start,end));
            }
            else
            {
                res.get(res.size()-1).set(1,Math.max(res.get(res.size()-1).get(1),end));
            }
        }
        int ans[][]=new int[res.size()][2];
        for(int i=0;i<res.size();i++)
        {
            ans[i][0]=res.get(i).get(0);
            ans[i][1]=res.get(i).get(1);
        }
        return ans;
    }
}