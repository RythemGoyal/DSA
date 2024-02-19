public class Stacks{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stacks(int size) {
        this.data = new int[size];
    }

    public Stacks() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        int rem = data[ptr];
        ptr--;
        return rem;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peak from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}