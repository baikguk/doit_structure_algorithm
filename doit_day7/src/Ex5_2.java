import java.util.Scanner;

public class Ex5_2 {
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }else
            return gcd(y, x%y);
    }
    static int gcdArray(int[] a){
        int reset = gcd(a[0],a[1]);
        for(int i =2;i<a.length;i++){
           reset = gcd(reset,a[i]);
        }
        return reset;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("유클리드 호제법으로 최대 공약수 구하기");
        System.out.println("첫번째 정수를 입력하세요");
        int x = sc.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int y = sc.nextInt();
        int result = gcd(x,y);
        System.out.println("세번째 정수를 입력하세요");
        int z = sc.nextInt();
        int []a = new int[]{x,y,z};
        System.out.println("두 정수의 최대 공약수는"+result+"입니다");
        System.out.println("배열 값들의 최대 공약수는 "+gcdArray(a)+"입니다");
    }
}
