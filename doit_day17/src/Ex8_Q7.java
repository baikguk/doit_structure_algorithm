import java.util.Comparator;
import java.util.NoSuchElementException;

public class Ex8_Q7<E> {

    private Node<E> head;
    private Node<E> crnt;


    class Node<E>{
        private E data;
        private Node<E> prev;
        private Node<E> next;

        Node(){
            data=null;
            prev=next=this;
        }

        Node(E data, Node<E> prev, Node<E> next){
            this.prev = prev;
            this.next = next;
            this.data = data;
        }
    }
    public Ex8_Q7(){
        head=crnt=new Node<>(); // 삽입과 삭제를 원할하게 위한 더미 노드 생성
    }

    public boolean isEmpty(){
        return head.next ==head;
    }

    public E search(E obj, Comparator<? super E> c){
        Node<E> ptr = head. next;
        while(ptr!=head){
            if(c.compare(obj, ptr.data)==0){
                crnt =ptr;
                return ptr.data;
            }
            ptr =ptr.next;
        }
        return null;
    }

    public void printCurrentNode(){
        if(isEmpty()){
            System.out.println("선택한 노드가 없습니다");
        }else {
            System.out.println(crnt.data);
        }
    }
    public void dump(){
        Node<E> ptr = head.next;

        while(ptr!=head){
            System.out.println(ptr.data);
            ptr= ptr.next;
        }
    }
    public void dumpReverse(){
        Node<E> ptr = head.prev;

        while(ptr!=head){
            System.out.println(ptr.data);
            ptr= ptr.prev;
        }
    }

    public boolean next(){
        if(crnt.next==head && isEmpty()){
            return false;
        }
        crnt =  crnt.next;
        return true;
    }

    public boolean prev(){
        if(crnt.prev == head&&isEmpty() ){
            return false;
        }
        crnt = crnt.prev;
        return true;
    }
    public void add(E obj){
        Node<E> node = new Node(obj,crnt,crnt.next);
        crnt.next=crnt.next.prev = node;
        crnt = node;
    }
    public void addFirst(E obj){
        crnt = head;
        add(obj);
    }
    public void addLast(E obj){
        crnt = head.prev;
        add(obj);
    }
    public void removeCurrentNode(){
        crnt.prev.next = crnt.next;
        crnt.next.prev = crnt.prev;
        crnt=crnt.prev;
        if(crnt==head){
            crnt=head.next;
        }
    }
    public void remove(Node p){
        Node<E> ptr = head.next;

        while(ptr.next!=head){
            if(ptr==p){
                crnt=p;
                removeCurrentNode();
                break;
            }
            ptr= ptr.next;
        }
    }
    public void removeFirst(){
        crnt = head.next;
        removeCurrentNode();
    }
    public void removeLast(){
        crnt = head.prev;
        removeCurrentNode();
    }
    public void clear(){
        while(!isEmpty()){
            removeFirst();
        }
    }
}
