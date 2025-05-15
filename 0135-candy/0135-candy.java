class Solution {
    public int candy(int[] ratings) {
        int[] lft = new int[ratings.length];
        int[] rt = new int[ratings.length];

        lft[0] = 1; 
        rt[ratings.length-1] = 1;

        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                lft[i] = lft[i-1] + 1;
            }
            else{
                lft[i] = 1;
            }
        }

        for(int i = ratings.length-2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                rt[i] = rt[i+1] + 1;
            }
            else{
                rt[i] = 1;
            }
        }

        int sum = 0;
        for(int i = 0; i < ratings.length; i++){
            sum = sum + Math.max(lft[i],rt[i]);
        }
        return sum;
    }
}