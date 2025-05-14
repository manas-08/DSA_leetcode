class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (sum(candies) < k) {
            return 0;
        }
        int low = 1, high = getMax(candies);
        while (low < high) {
            int mid = (low + high + 1) / 2;
            if (canBeAllocated(candies, k, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public boolean canBeAllocated(int[] candies, long k, int pileSize) {
        if (pileSize == 0) return true;
        long totalPiles = 0;
        for (int cdy : candies) {
            totalPiles += cdy / pileSize;
            if (totalPiles >= k) return true;
        }
        return false;
    }

    public long sum(int[] candies) {
        long sum = 0;
        for (int cdy : candies) {
            sum += cdy;
        }
        return sum;
    }

    public int getMax(int[] candies) {
        int max = 0;
        for (int cdy : candies) {
            max = Math.max(max, cdy);
        }
        return max;
    }
}