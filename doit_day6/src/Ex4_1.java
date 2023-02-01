public class Ex4_1 {
    private int[] stk;
    private int capacity; //용량  (스텍의 크기)
    private int ptr;// 스텍 포인터 (스텍이 쌓여있는 데이터 수)

    public class EmptyIntStackExceptrion extends RuntimeException{ //실행시 스텍이 비어있는 경우의 예외처리
        public EmptyIntStackExceptrion(){}
    }

    public class OverflowIntStackException extends RuntimeException{ // 실행시 스텍이 다 차있는 경우의 예외처리
        public OverflowIntStackException(){}
    }

    public Ex4_1(int maxlen){
        ptr=0;
        capacity = maxlen;
        try{
            stk = new int[capacity]; // 스텍 본체용 배열 생성
        }catch (OutOfMemoryError e){ //생성할 수없는 경우 크기가 0인 배열을 생성 -> 이를 통해 다른 메서드가 존재하지 않는 stk 배열에 잘못 접근하는 경우를 방지함
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if(ptr>=capacity){
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackExceptrion{
        if(ptr<=0){
            throw new EmptyIntStackExceptrion();
        }
        return stk[--ptr];
    }

    public int peek()throws EmptyIntStackExceptrion{
        if(ptr<=0){
            throw new EmptyIntStackExceptrion();
        }
        return stk[ptr-1];
    }

    public void clear(){
        ptr=0;
    }
    public int indexOf(int x){
        for(int i = ptr-1;i>=0;i--)
            if(stk[i]== x)
                return i;
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr <=0;
    }

    public boolean isFull(){
        return ptr >=capacity;
    }
    public void dump(){
        if(ptr<=0) {
            System.out.println("스텍은 비어있습니다");
        }else{
            for(int i =0;i<ptr;i++){
                System.out.print(stk[i]+ " ");
            }
            System.out.println();
        }
    }
}
