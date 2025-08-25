class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            // perfrom the operation
            n = sumOfSquares(n);
        }
        return true;
    }

    public int sumOfSquares(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += (rem*rem);
            n = n/10;
        }
        return sum;
    }
}