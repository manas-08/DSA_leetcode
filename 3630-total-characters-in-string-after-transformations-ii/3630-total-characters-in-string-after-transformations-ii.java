class Solution {
    static final int MOD = 1000000007;
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) 
    {
        int n = 26;

        long[][] TransMat = new long[n][n];
        for (int i = 0; i < n; i++) 
        {
            int sprd = nums.get(i);
            for (int j = 1; j <= sprd; j++) 
            {
                int next = (i + j) % 26;
                TransMat[i][next] = (TransMat[i][next] + 1) % MOD;
            }
        }

       
        long[] freqArr = new long[n];
        for (char c : s.toCharArray()) 
        {
            freqArr[c - 'a']++;
        }

        
        long[][] T_pow = matrixPower(TransMat, t);

        
        long[] result = new long[n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                result[j] = (result[j] + freqArr[i] * T_pow[i][j]) % MOD;
            }
        }

        long total = 0;
        for (long val : result)
        {
            total = (total + val) % MOD;
        } 
        
        return (int) total;
    }

    public long[][] matrixPower(long[][] base, int exp) 
    {
        long[][] res = new long[base.length][base.length];
        for (int i = 0; i < base.length; i++) res[i][i] = 1;

        while (exp > 0) 
        {
            if ((exp & 1) == 1)
                res = multiply(res, base);
            
            base = multiply(base, base);
            exp >>= 1;
        }

        return res;
    }

    public long[][] multiply(long[][] A, long[][] B) 
    {
        int n = A.length;
        long[][] result = new long[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int k = 0; k < n; k++) 
            {
                if (A[i][k] == 0)
                    continue;
                
                for (int j = 0; j < n; j++) 
                    result[i][j] = (result[i][j] + A[i][k] * B[k][j]) % MOD;
            }
        }
        return result;
    }
}