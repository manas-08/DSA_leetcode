class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int[] result = new int[2];
        for (int i = left; i <= right; i++) {
            if(prime(i) && i != 1) primes.add(i);
        }
        if(primes.size() == 0 || primes.size() == 1) return new int[]{-1,-1};
        int min_gap = Integer.MAX_VALUE; 
        for(int j = 0; j < primes.size() - 1; j++){
            if(primes.get(j+1) - primes.get(j) < min_gap){
                min_gap = primes.get(j+1) - primes.get(j);
                result[0] = primes.get(j);
                result[1] = primes.get(j+1);
            }
        }
        return result;
    }
    // for checking prime
    public boolean prime(int n) { // time complexity - O(sqrt(n))
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}