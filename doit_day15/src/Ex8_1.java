public class Ex8_1 {
    class Node<E>  {
        private E data;
        private Node<E> next;
        Node(E data, Node<E> next){
            this.data =data;
            this.next = next;
        }
    }
    private Node<E> head;
    private Node<E> crnt;

    public Ex8_1(){
        head = crnt = null;
    }
}
