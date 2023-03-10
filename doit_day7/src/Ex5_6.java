import java.util.Scanner;

public class Ex5_6 {
    static String[] memo;
    static int count;

    static void recur(int n) {
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n +"\n" + memo[n - 1];
            } else {
                memo[n + 1] = "";
            }
        }
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int n = sc.nextInt();
        memo = new String[n+2];
        recur(n);
        System.out.println("---------------");
        System.out.println("카운트 횟수 :" + count);
    }
}
