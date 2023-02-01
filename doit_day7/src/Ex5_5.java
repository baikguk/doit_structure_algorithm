import java.util.Scanner;

public class Ex5_5 {
    static void recur_without_recur(int n){
        Stack<Integer> stk = new Stack<>(n);

        while(true){
            if(n>0){
                stk.push(n);
                n-= 1;
                continue;
            }
            if(!stk.isEmpty()){
                n = stk.pop();
                System.out.print(n+" ");
                n-=2;
                continue;
            }
            System.out.println();
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int n = sc.nextInt();
        recur_without_recur(n);
    }
}
class Stack<E>{
    private E[] stk;
    private int capacity;
    private int ptr;

    static class EmptyStackException extends RuntimeException{
        EmptyStackException(){};
    }

    static class OverflowStackException extends RuntimeException{
        OverflowStackException(){};
    }

    Stack(int maxlen){
        try{
            capacity = maxlen;
            ptr=0;
            stk = (E[])new Object[capacity];
        }catch (OutOfMemoryError e){
            capacity =0;
        }
    }

    public E push(E x) throws OverflowStackException{
        if(ptr>=capacity){
            throw new OverflowStackException();
        }else
            return stk[ptr++] =x;
    }
    public E pop() throws EmptyStackException{
        if(ptr<=0){
            throw new EmptyStackException();
        }else
            return stk[--ptr];
    }
    public boolean isEmpty(){
        return ptr <= 0;
    }
}

