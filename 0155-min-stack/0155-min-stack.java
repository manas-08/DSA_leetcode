class MinStack {
    int[] data;
    int ptr = -1;    // initialised as -1 
    public MinStack() {
        this.data = new int[10000];
    }
    
    public void push(int val) {
        data[++ptr] = val;
    }
    
    public void pop() {
        System.out.println(ptr);
        ptr--;
    }
    
    public int top() {
        return data[ptr];
    }
    
    public int getMin() {
        int min = data[0];
        for(int i = 0; i <= ptr; i++){
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */