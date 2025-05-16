class Solution {
    public int kthFactor(int n, int k) {
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(1);
    for(int i = 2; i <= n/2; i++){
        if(n%i == 0) l.add(i);
        }   
    l.add(n);
    if(l.size() < k) return -1;
    return l.get(k-1);
    }
}