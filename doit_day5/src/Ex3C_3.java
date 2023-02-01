public class Ex3C_3 {
    static class GenericClass<T> {
        private T xyz;

        GenericClass(T t) {
            this.xyz =t;
        }
        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s =new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(s.xyz);
        System.out.println(n.getXyz());
        System.out.println(n.xyz);
    }
}
