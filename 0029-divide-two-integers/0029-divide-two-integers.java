class Solution {
    public int divide(int dividend, int divisor) {
        // if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        // if (dividend == divisor)
        //     return 1;
        // boolean sign = true;
        // if (dividend >= 0 && divisor < 0)
        //     sign = false;
        // if (dividend < 0 && divisor > 0)
        //     sign = false;

        // long num = Math.abs((long)dividend);        // converting dividend into long beforehand is needed as no. like Integer.MIN_VALUE when applied abs gives a out of range value.
        // long den = Math.abs((long)divisor);
        // int quotient = 0;

        // while (num >= den) {
        //     int count = 0;
        //     while (num >= (den << (count + 1))) {
        //         count++;
        //     }
        //     quotient += 1 << (count);
        //     num = num - (den << (count));
        // }
        // if (quotient >= Integer.MAX_VALUE && sign)
        //     return Integer.MAX_VALUE;
        // if (quotient >= Integer.MAX_VALUE)
        //     return Integer.MIN_VALUE;
        // return sign ? quotient : -quotient;

        int n = 0;
        long res = 0;
        long sign = 1;

        if (divisor == 1) return dividend;
        if ((dividend < 0 && divisor >= 0) || (dividend >= 0 && divisor < 0)) sign = -1;
        long dvd = Math.abs((long) dividend);
        long dvr = Math.abs((long) divisor);
        for (int t = 30; t >= 0; t--) {
            if (dvd >= (dvr << t)) {
                res += (1 << t);
                dvd -= (dvr << t);
            }
        }
        return (int) (res * sign);
    }
}

/// Brute - force approach. [will show TimeLimit exceeded]
// if (dividend == Integer.MIN_VALUE && divisor == -1) {
// return Integer.MAX_VALUE;
// }
// // if (divisor == 1)
// // return dividend;
// // if (divisor == -1 && dividend < 0)
// // return -(dividend);
// int num1 = dividend;
// int num2 = divisor;
// if (dividend < 0)
// num1 = -(dividend);
// if (divisor < 0)
// num2 = -(divisor);
// int quo = 0;
// while (num1 - num2 >= 0) {
// num1 -= num2;
// quo++;
// }
// if (dividend < 0 && divisor < 0)
// return quo;
// if (dividend < 0 || divisor < 0)
// return -(quo);
// return quo;
// }