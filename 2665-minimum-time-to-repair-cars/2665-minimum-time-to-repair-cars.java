class Solution {
    public long repairCars(int[] ranks, int cars) {
       int minRank = ranks[0], maxRank = ranks[0];

       for(int rank: ranks){
        minRank = Math.min(rank, minRank);
        maxRank = Math.max(rank, maxRank);
       }
       
       int[] freqArr = new int[maxRank+1];
       for(int i = 0; i < ranks.length; i++){
            //minRank = Math.min(minRank, ranks[i]);
            freqArr[ranks[i]]++;
       }

       //minimum possible time, max possible time
       long low = 1, high = 1L * minRank * cars * cars;

       //binary search
       while(low < high){
            long mid = (low+high) / 2;
            long carsCanBeRepaired = 0;

            for(int rank = 1; rank <= maxRank; rank++){
                carsCanBeRepaired += freqArr[rank] * (long) Math.sqrt(mid / (long) rank);
            }
            // adjust the search boundaries based on no. of cars repaired
            if(carsCanBeRepaired >= cars) high = mid;
            else low = mid + 1; 
       }
       return low;
    }
}