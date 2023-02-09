import java.util.Arrays;

public class Ex6_14 {
    public static void main(String[] args) {
        int[] x = new int[]{6,4,3,7,1,9,8};

        Arrays.sort(x); //-> 안정적이지 않음

        for(int i =0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
