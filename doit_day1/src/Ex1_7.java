import java.util.Scanner;

import static java.lang.Math.abs;

public class Ex1_7 {
    static int sumof(int a, int b){

        int sum = 0;
        if(a>b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }else{
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum=0;
        while(i <=n){
            sum += i;
            i+=1;
        }
        System.out.println(sum);
        sum = 0;
        for(int j =1; j<=n;j++){
            sum+=j;

        }
        System.out.println(sum);
        System.out.println(sumof(1,5));
        System.out.println(sumof(5,1));

    }
}
