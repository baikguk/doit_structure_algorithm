import java.util.Comparator;

public class Ex9_1<K,V> {
    static class Node<K,V>{
        private K key;
        private V data;
        private Node<K,V> left;
        private Node<K,V> right;

        Node(K key, V data, Node<K,V> left, Node<K,V> right){
            this.key =key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey(){
            return key;
        }

        V getData(){
            return data;
        }

        void print(){
            System.out.println(data);
        }
    }

    private Node<K,V> root; //연결리스트의 머리노드에 해당
    private Comparator<? super K> comparator = null;

    public Ex9_1(){
        root = null;
    }
    public Ex9_1(Comparator<? super K>  c){
        this();// -> 기본 생성자 호출
        comparator =c;
    }

    private int comp(K key1, K key2){
        return (comparator==null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1,key2);
    }

    private V search(K key){
        Node<K,V> p =root;

        while(true){
            if(p ==null){
                return null;
            }

            int cond = comp(key,p.getKey());

            if(cond==0){
                return p.getData();
            } else if (cond<0) {
                p=p.left;
            }else{
                p=p.right;
            }
        }
    }

    private void addNode(Node<K,V> node, K key, V data){
        int cond = comp(node.getKey(),key);
        if(cond==0){
            return;
        } else if (cond<0) {
            if(node.left==null){
                node.left = new Node<>(key,data,null,null);
            }else {
                addNode(node.left,key,data);
            }
        }else{
            if(node.right==null){
                node.right = new Node<>(key,data,null,null);
            }else{
                addNode(node.right,key,data);
            }
        }
    }
    private void add(K key,V data){
        if(root==null){
            root = new Node<>(key,data,null,null);
        }else{
            addNode(root,key,data);
        }
    }
}
