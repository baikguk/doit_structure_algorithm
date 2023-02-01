import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟 수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];
        System.out.print("x[0]");
        x[0] = sc.nextInt();
        for(int i =1;i<num;i++){
            do{
                System.out.print("x["+i+"]");
                x[i] = sc.nextInt();

            }while(x[i]<x[i-1]);
        }

        System.out.println("검색할 값 : ");
        int key = sc.nextInt();

        int idx= Arrays.binarySearch(x,key);
                    // ㄴ 이진검색을 해주는 라이브러리

        if(idx<0){
            System.out.println("찾는 값이 없지만 x["+idx+"] 에 넣으면 될것 같습니다");
                                        // 검색 실패시 반환값 idx= -x-1
                                            //                     x: 삽입 포인트

        }else
            System.out.println("찾는 값은 x["+idx+"] 에 있습니다");
    }
}
