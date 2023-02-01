import java.util.Scanner;

public class Ex5_3 {
    static int count=0;
    static void recur(int n){
        if(n>0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
        count++;
    }
    static void tail_recursion_recur(int n){
        while(n>0){
            recur(n-1);
            System.out.println(n);
            n=n-2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int n = sc.nextInt();
        recur(n);
        System.out.println("반복 횟수 : "+count);

    }
}
