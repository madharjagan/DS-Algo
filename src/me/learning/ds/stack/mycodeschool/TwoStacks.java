package me.learning.ds.stack.mycodeschool;

class TwoStacks<V> {
    private int maxSize;
    private V[] array;
    private int stack1Top = -1;
    private int stack2Top = -1 ;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
        stack2Top = (maxSize/2)-1;
    }

    //insert at top of first stack
    public void push1(V value) {
        if(stack1Top<(maxSize/2))
            array[++stack1Top] = value;
    }

    //insert at top of second stack
    public void push2(V value) {
        if(stack2Top<=maxSize)
            array[++stack2Top] = value;
    }

    //remove and return value from top of first stack
    public V pop1() {
        if(stack1Top == -1)
            return null;
        return array[stack1Top--];
    }

    //remove and return value from top of second stack
    public V pop2() {
        if(stack2Top == (maxSize/2-1))
            return null;
        return array[stack2Top--];
    }
}
