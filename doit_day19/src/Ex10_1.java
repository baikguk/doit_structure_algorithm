//해시 복습
public class Ex10_1<K,V> {
    class Node<K,V>{
        private K key;
        private V data;
        private Node<K,V> next; // 다음 노드 참조

        Node(K key, V data, Node<K,V> next){
            this.key = key;
            this.data = data;
            this.next = next;
        }

        K getKey(){
            return key;
        }

        V getData(){
            return data;
        }

        public int hashCode(){
            return key.hashCode();
        }
    }

    private int size;
    private Node<K,V>[] table;

    public Ex10_1(int capacity){
        try{
            table = new Node[capacity];
            size = capacity;
        }catch (OutOfMemoryError e){
            this.size =0;
        }
    }

    public int hashValue(Object key){
        return key.hashCode() % size;
    }

    public V search(K key){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while(p!=null){
            if(p.getKey().equals(key))
                return p.getData();
            p=p.next;
        }
        return null;
    }

    public int add(K key, V data){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];

        while(p!=null){
            if(p.getKey().equals(key))
                return 1;
            p=p.next;
        }
        Node<K,V> temp = new Node<>(key,data,table[hash]);
        table[hash] = temp;
        return 0;
    }

    public int remove(K key){
        int hash = hashValue(key);
        Node<K,V> p = table[hash];
        Node<K,V> pp = null;

        while(p!=null){
            if(p.getKey().equals(key)){
                if(pp==null){
                    table[hash] = p.next;
                }else
                    pp.next = p.next;
                return 0;
            }
            pp = p;
            p = p.next;
        }
        return 1;
    }

    public void dump(){
        for(int i = 0; i<size;i++){
            Node<K,V> p = table[i];
            System.out.printf("%02d  ", i);
            while(p!=null){
                System.out.printf("-> %s (%s)  ",p.getKey(),p.getData());
                p = p.next;
            }
            System.out.println();
        }
    }
}
