
//프로그램은 컴퓨터에게 일을 하라고 지시하는 명령의 모임
import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    //              ㄴ 키보드와 연결된 표준 입력 스트림
        System.out.println("세 정수의 최대 값을 구합니다");
        System.out.printf("a의 값: ");
        int i1 = sc.nextInt();
        System.out.printf("b의 값: ");
        int i2 = sc.nextInt();
        System.out.printf("c의 값: ");
        int i3 = sc.nextInt();

        String str1 = sc.next();
        String str2 = sc.nextLine();


        int max;
        max= i1;
        if(max<i2){max=i2;}
        if(max<i3){max=i3;}

        System.out.println("최대값은"+max+"입니다");

        //순차적으로 실행되 는 구조 순차(Sequential) 구조
        // if문은 평가 결과에 따라 프로그램 실행 순서가 바뀜-> 선택구조
        System.out.println(str1);
        System.out.println(str2);
    }
}
