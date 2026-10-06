class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        int up=1, down=1;
        for(int i=0;i<n-1;i++)
        {
            int diff=nums[i+1]-nums[i];
            if(diff>0)
                up=down+1;
            else
                down=up+1;
        }
        return Math.max(up,down);
    }
}