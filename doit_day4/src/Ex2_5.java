import java.util.Arrays;

public class Ex2_5 {

    static void swap(int[] a, int idx1, int idx2){
        int box = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = box;
    }
    static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            swap(a,i,a.length-1-i);
        }
    }
    public static void main(String[] args) {
        int[] a = {2,5,1,3,9,6,7};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
