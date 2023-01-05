import java.util.Scanner;
/*
 구조적 프로그래밍 :
    입력하는 곳 하나와 출력하는 곳 하나를 갖는 구성 요소만 사용하여,
    이를 계층적으로 배치하여 프로그램을 구성하는 방식
        순차(코드의 배치 순서),선택(if),반복(loop) 사용
*/


public class Ex1C_2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        do{
            n =sc.nextInt();
        }while(n/10>=10||n/10<1);
        System.out.println(n);
        // 드모르간 법칙에 의해 부등호에 NOT(!) 사용시
        do{
            n =sc.nextInt();
        }while(!(n/10<10&&n/10>=1));
        System.out.println(n);
    }
}
