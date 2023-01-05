import java.util.Scanner;

public class Ex1C_1 {
    static int median(int i1, int i2 , int i3){

        if(i1<=i2){
            if(i2<=i3) return  i2;
            else if (i2>i3) return i3;
            else return i1;
        }else{
            if(i2>=i3) return i2;
            else return i1;
        }
        // ㄴ 위 방식과는 다르게 ||를 통해서 할시 효율떨어짐
        //      같은 판단을 여러번 하기 때문
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        System.out.println(median(i1,i2,i3));
    }
}
