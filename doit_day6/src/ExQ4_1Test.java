import java.util.Scanner;

public class ExQ4_1Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N =10;
        int[] ring_que = new int[N];
        int cnt=0;
        int retry;

        System.out.println("정수를 입력하세요 : ");

        do{
            System.out.printf("%d번째 정수 : ",cnt + 1);
            ring_que[cnt++%N]= sc.nextInt();

            System.out.println("계속 할까요(예.1/ 아니요.2");
            retry=sc.nextInt();
        }while(retry==1);


        if(cnt>N){
            for(int i =9;i>=0;i--){
                System.out.printf("%2d 번째 정수는 = %d\n",cnt-i,ring_que[(cnt-i-1)%N]);
            }
        }

        for(int i =0;i<cnt;i++){
            System.out.printf("%2d 번째 정수는 = %d\n",i+1,ring_que[i]);
        }

    }
}
