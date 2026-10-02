class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            int n=num;
            sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            num=sum;
        }
        return num;
    }
}