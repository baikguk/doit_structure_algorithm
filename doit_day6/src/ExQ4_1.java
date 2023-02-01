public class ExQ4_1 {
}
class Que<E>{
    private E[] que;
    private  int capacity;
    private int num;
    private int rear;
    private int front;

    public static class EmptyQueException extends RuntimeException{
        EmptyQueException(){};
    }
    public static class OverflowQueException extends RuntimeException{
        OverflowQueException(){};
    }

    public Que(int size){
        capacity = size;

        rear=front=num=0;
        try{
             que = (E[]) new Object[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }
    public E enque(E x){
        if(num>=capacity){
            throw new OverflowQueException();
        }
        que[rear++]=x;
        num++;
        if(rear==capacity){
            rear=0;
        }
        return x;
    }

    public E deque(){
        if(num<=0) {
            throw new EmptyQueException();
        }
        E result = que[front++];
        num--;
        if(front==capacity){
            front=0;
        }
        return result;
    }
    //--- 큐에서 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
    public E peek() throws EmptyQueException {
        if (num <= 0)
            throw new EmptyQueException();			// 큐가 비어 있음
        return que[front];
    }

    //--- 큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다---//
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx].equals(x) )                    // 검색 성공
                return idx;
        }
        return -1;									// 검색 실패
    }

    //--- 큐를 비웁니다 ---//
    public void clear() {
       front=rear= num = 0;
    }

    //--- 큐의 용량을 반환합니다 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 큐에 쌓여있는 데이터수를 반환합니다 ---//
    public int size() {
        return num;
    }

    //--- 큐가 비어 있는가? ---//
    public boolean isEmpty() {
        return num <= 0;
    }

    //--- 큐가 가득 찼는가? ---//
    public boolean isFull() {
        return num >= capacity;
    }

    //--- 큐 안의 모든 데이터를 맨앞 → 맨끝의 순서로 출력 ---//
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++) {

                System.out.print(que[(i+front)%capacity] + " ");
            }
            System.out.println();
        }
    }
    public int search(E x){
        for(int i=0;i<num;i++){
            int idx=(i+front)%capacity;
            if(que[idx].equals(x)){
                return i+1;
            }
        }
        return 0;
    }

}
