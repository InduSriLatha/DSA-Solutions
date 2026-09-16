class Solution {
    public void sortColors(int[] arr) {
        int i=0,n=0,j=arr.length-1;
        while(n<=j)
        {
            if (arr[n]==0)
            {
                swap(arr,i,n);
                i++;
                n++;
            } 
            else if(arr[n]==1)
                n++;
            else
            {
                swap(arr,n,j);
                j--;
            }
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}