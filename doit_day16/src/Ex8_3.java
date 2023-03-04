import java.util.Comparator;

public class Ex8_3<E> {
    class Node<E> {
        private E data;
        private int next;
        private int dnext;

        void set(E data, int next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node<E>[] n;
    private int size;
    private int max; // 사용중인 꼬리 record
    private int head;
    private int crnt;
    private int deleted; // 프리 리스트의 머리 노드
    private static final int NULL = -1;

    public Ex8_3(int capacity){
        head=crnt=max=deleted=NULL;
        try{
            n = new Node[capacity];
            for(int i=0;i<capacity;i++) {
                n[i] = new Node<E>();
            }
            size = capacity;
        }catch (OutOfMemoryError e){
            size = 0;
        }
    }

    private int  getInsertIndex(){
        if (deleted == NULL) {
            if(size>max){
                return max++;
            }else
                return NULL;
        }else {
            int rec = deleted;
            deleted = n[rec].dnext;
            return rec;
        }
    }

    private void deleteIndex(int idx){
        if(deleted==NULL){
            deleted=idx;
            n[idx].dnext=NULL;
        }else{
            int rec = deleted;
            deleted =idx;
            n[idx].dnext = rec;
        }
    }

    public E search(E obj, Comparator<? super E> c){
        int ptr = head;

        while(ptr!=NULL){
            if(c.compare(obj,n[ptr].data)==0){
                return n[ptr].data;
            }
            ptr=n[ptr].next;
        }
        return null;
    }

    public void addFirst(E obj){
        int ptr = head;
        int rec = getInsertIndex();
        if(rec!=NULL){ // Overflow 확인
            head = crnt= rec;
            n[head].set(obj, ptr);
        }
    }

    public void addLast(E obj){
        if(head==NULL) {
            addFirst(obj);
        } else{
            int ptr = head;
            if(n[ptr].next!=NULL){
                ptr= n[ptr].next;
            }
            int rec= getInsertIndex();
            if(rec!=NULL){
                n[ptr].next=crnt=rec;
                n[rec].set(obj,NULL);
            }
        }
    }

    public void removeFirst(){
        if(head!=NULL){
            int ptr = n[head].next;
            deleteIndex(head);
            head=crnt=ptr;
        }
    }

    public void removeLast( ){
        if (head != NULL) {
            if (n[head].next == NULL) {
                removeFirst();
            }else {
                int ptr = head; //스캔중인 노드
                int pre = head; // 스캔중인 노드의 앞노드

                while (n[ptr].next != NULL) {
                    pre = ptr;
                    ptr = n[ptr].next;
                }
                n[pre].next=NULL;
                deleteIndex(ptr);
                crnt=pre;
            }
        }
    }

    public void remove(int p){
        if(head!=NULL){
            if(p==head){
                removeFirst();
            }else{
                int ptr =head;

                while(n[ptr].next!=p){
                    ptr = n[ptr].next;
                    if(ptr==NULL){
                        return;
                    }
                }
                n[ptr].next = NULL;
                deleteIndex(p);
                n[ptr].next = n[p].next;
                crnt = ptr;
            }
        }
    }
    public void removeCurrentNode(){
        remove(crnt);
    }

    public void clear(){
        while(head!=NULL){
            removeFirst();
        }
        crnt=NULL;
    }

    public boolean next(){
        if(crnt==NULL||n[crnt].next ==NULL){
            return false;
        }
        crnt = n[crnt].next;
        return true;
    }

    public void printCurrentNode(){
        if(crnt==NULL){
            System.out.println("선택한 노드가 없습니다");
        }else
            System.out.println(n[crnt].data);

    }

    public void dump(){
        int ptr=head;

        while(ptr!=NULL){
            System.out.println(n[ptr].data);
            ptr=n[ptr].next;
        }
    }
}
