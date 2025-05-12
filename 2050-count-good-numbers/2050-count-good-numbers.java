class Solution {
    long mod = 1000000007;
    public int countGoodNumbers(long n) {
        // long count = 0;
        // long start = (long)Math.pow(10, n-1);
        // long end = (long) Math.pow(10, n);
        // long idx = n - 1;
        // boolean valid = true;
        // for(long i = start; i < end; i++){
        //     idx = n-1;
        //     long num = i;
        //     while(num != 0){
        //         long rem = num % 10;
        //         num /= 10;
        //         idx--;
        //         if((idx+1) % 2 != 0 && (rem == 2 || rem == 3 || rem == 5 || rem == 7)) valid = true;
        //         else if((idx+1) % 2 == 0 && (rem % 2 == 0)) valid = true;
        //         else valid = false;
        //     }
        //     if(valid) count++; // inc count when it is valid
            
        // }
        // return (int) (count % (long)(Math.pow(10, 9) + 7))+ 1;
        return (int) ((pow(5, (n+1)/2) * pow(4, n/2)) % mod);
    }

    // use fast exponentiation
    public long pow(int x, long y){
        long ret = 1;
        long mul = x;
        while(y > 0){
            if(y%2==1){
                ret = (ret * mul) % mod;
            }
            mul = (mul*mul) % mod;
            y /= 2;
        }
        return ret;
    }
}