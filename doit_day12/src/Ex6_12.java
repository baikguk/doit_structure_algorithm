public class Ex6_12 {
    static void merge(int[] a, int[] b, int[] c){
        int pa =0;
        int pb =0;
        int pc =0;

        while(pa<a.length&&pb<b.length){
            c[pc++] = (a[pa] <= b[pb])? a[pa++]:b[pb++];
        }
        while(pa<a.length){
            c[pc++] = a[pa++];
        }
        while(pb<b.length){
            c[pc++] = b[pb++];
        }
    }

    public static void main(String[] args) {
        int[] a= new int[]{2,4,6,8,11,13};
        int[] b = new int[]{1,2,3,4,9,16,21};
        int[] c = new int[a.length+b.length];

        merge(a,b,c);

        System.out.print("a : ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.print("b : ");
        for(int i =0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();

        System.out.print("c : ");
        for(int i =0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
