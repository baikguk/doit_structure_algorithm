import java.util.Scanner;

public class Ex1_2 {
    public static int max3(int i1, int i2, int i3){
        int max = i1;
        if(max<i2) max=i2;
        if(max<i3) max=i3;
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        System.out.println(max3(i1,i2,i3));
    }
}
