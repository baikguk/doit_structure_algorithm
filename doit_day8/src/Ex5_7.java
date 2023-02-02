import java.util.Scanner;

public class Ex5_7 {
    static void move(int n,int x, int y){
        if(n>1){
            move(n-1,x,6-x-y);
        }
        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n",n,x,y);
        if(n>1){
            move(n-1,6-x-y,y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("하노이탑 문제 원반 갯수 입력 : ");
        int n = sc.nextInt();
        move(n,1,3);

    }
}
