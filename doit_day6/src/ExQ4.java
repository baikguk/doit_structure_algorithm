public class ExQ4 {
    private int[] que;
    private  int capacity;
    private int num;
    private int rear;
    private int front;

    public class EmptyQueException extends RuntimeException{
        EmptyQueException(){};
    }
    public class OverflowQueException extends RuntimeException{
        OverflowQueException(){};
    }

    public ExQ4(int size){
        capacity = size;

        rear=front=num=0;
        try{
            que = new int[64];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }
    public int enque(int x){
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

    public int deque(){
        if(num<=0) {
            throw new EmptyQueException();
        }
        int result = que[front++];
        num--;
        if(front==capacity){
            front=0;
        }
        return result;
    }
    //--- 큐에서 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
    public int peek() throws EmptyQueException {
        if (num <= 0)
            throw new EmptyQueException();			// 큐가 비어 있음
        return que[front];
    }

    //--- 큐에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다---//
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x)                    // 검색 성공
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

}
