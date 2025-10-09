class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c = numBottles;
        int present_bottles = numBottles;
        while(present_bottles / numExchange != 0){
            c += (present_bottles / numExchange);
            int temp = present_bottles;
            present_bottles /= numExchange;
            present_bottles += (temp % numExchange);
        }
        return c;
    }
}