class Solution {
    public List<Integer> grayCode(int n) {
         List<Integer> al= new ArrayList<>();

        for(int i=0;i<Math.pow(2,n);i++)    al.add(i^(i>>1));
        return al;
    }
}