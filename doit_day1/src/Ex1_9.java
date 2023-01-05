import java.util.Scanner;


// do while로 음력받는 경우 고려하여 합 출력
// do{}while();
//      ㄴ while() 뒤에 ; 붙여야함
public class Ex1_9 {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        int i =1;
        do{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n<=0);

        while(i<n){
            sum+=i;
            System.out.print(i+"+");
            i+=1;
        }
        System.out.println(n+"="+(sum+n));
        //   ㄴ 마지막 루프에만 적용하려는 형식을 위해
        //     루프안에 if를 넣어 한다면 효율이 떨어짐
        //     따라서 마지막 경우를 따로 빼줌
    }
}
