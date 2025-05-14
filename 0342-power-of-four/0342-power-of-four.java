class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n > 0 && n % 4 == 0){
            if(isPowerOfFour(n/4)) return true;
        }
        return false;
        }
    }
