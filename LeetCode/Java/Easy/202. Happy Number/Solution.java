class Solution {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        } else if (n < 10) {
            return false;
        } else {
            
            int num = 0;

            while (n > 0) {
                num += (n % 10) * (n % 10);
                n /= 10;
            }

            return isHappy(num);
        }
    }
}