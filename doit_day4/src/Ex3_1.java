import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ex3_1 {
    static int Search_alg(int a[], int num, int key){
        int i = 0;
        while(true){
            if(a[i]==key){
                return i;
            }
            if(i==num){
                return -1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : " );
        int num =  sc.nextInt();

        int[] a = new int[num];

        for(int i =0; i<a.length;i++){
            System.out.print("a["+i+"] : ");
            a[i] = sc.nextInt();
        }
        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int result = Search_alg(a,num,key);

        if(result==-1){
            System.out.println("찾는 값이 없습니다");
        }else{
            System.out.println("찾는 값은 a["+result+"] 에 있습니다"); // index 0 부터 시작하여 처음 찾는것을 반환함
        }
    }
}
