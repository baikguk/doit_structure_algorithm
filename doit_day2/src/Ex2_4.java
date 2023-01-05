import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int n = rand.nextInt(10)+ 1;

        int[] height = new int[n];

        for(int i = 0;i<height.length;i++){
            height[i] = 100 + rand.nextInt(90);
            //                  ㄴ 0~89 난수 발생
        }
        System.out.println("사람 수 : "+n+"\n최대키 : "+MaxOfArrayRand.maxOf(height));
        System.out.println(Arrays.toString(height));
    }
}
class MaxOfArrayRand{
    static int maxOf(int[] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]) max=a[i];
        }
        return max;
    }
}
