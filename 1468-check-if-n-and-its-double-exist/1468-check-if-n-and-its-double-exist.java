class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length; k++){
                if(k!= i && arr[i] == arr[k]*2) return true;
            }
        }
        return false;
    }
}