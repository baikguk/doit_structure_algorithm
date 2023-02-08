public class IntStack {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){};
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){};
    }

    public IntStack(int maxlen){
        ptr=0;
        capacity=maxlen;
        try{
            stk = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity=0;
        }
    }
    public void push(int x) throws OverflowIntStackException{
        if(ptr>=capacity) {
            throw new OverflowIntStackException();
        }else
            stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(ptr<=0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }
    public boolean isEmpty(){
        return ptr <= 0;
    }

}
