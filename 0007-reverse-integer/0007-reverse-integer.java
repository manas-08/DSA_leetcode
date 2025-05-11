class Solution {
    public int reverse(int x) {
        int flag = 0;
        if(x < 0){
            x = (-1) * x; 
            flag = 1;
        } // for negative

        long rev = 0;
        while(x > 0){
            rev = (rev * 10) + x % 10;
            x /= 10;
        }
        if(rev > Integer.MAX_VALUE) return 0; // to handle a number exceeding int range..
        if (flag == 1) return (int) ((-1) * rev); // flag when set(1), gives indication of a negative integer
        return (int)rev;
    }
}