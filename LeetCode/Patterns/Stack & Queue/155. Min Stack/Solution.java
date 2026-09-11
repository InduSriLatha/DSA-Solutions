class MinStack {
    Stack<Integer> st;
    List<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min=new ArrayList<>();
    }
    
    public void push(int value) {
        if(min.size()>0 && value>min.get(min.size()-1))
            min.add(min.get(min.size()-1));
        else
            min.add(value); 
        st.push(value);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.get(st.size()-1);   
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */