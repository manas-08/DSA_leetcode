class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n=bottomLeft.length;
        long res=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long tmp=maxsquarePossible(bottomLeft[i][0],bottomLeft[i][1],topRight[i][0],topRight[i][1], bottomLeft[j][0],bottomLeft[j][1],topRight[j][0],topRight[j][1]);
                if(tmp>res)
                res=tmp;

            }
        }
        return (res*res);
    }
    long maxsquarePossible(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        if(ax1>=bx2 || ay1>=by2 || ay2<=by1 || ax2<=bx1)
        return 0;
        
        int cx1=Math.max(ax1,bx1);
        int cx2=Math.min(ax2,bx2);
        int cy1=Math.max(ay1,by1);
        int cy2=Math.min(ay2,by2);

        return Math.min(cx2-cx1, cy2-cy1);
    }
}