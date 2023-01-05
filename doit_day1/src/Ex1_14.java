import java.util.Scanner;

public class Ex1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;
        //n이 음수일 때 처리
        do{n = sc.nextInt();}while(n<=0);
        do{w = sc.nextInt();}while(w>14||w<0);
//        for(int i=1; i<=n;i++){
//            System.out.print("*");
//            if(i%w==0){
//                System.out.print("\n");
//            }
//        }
//        if(n%w!=0){
//            System.out.print("\n");
//        }
        // 주석 코드 개선
        for(int i = 0; i<n/w;i++){
            System.out.println("*".repeat(w));
        }
        int rest = n%w;
        if(rest!=0){System.out.println("*".repeat(rest));}
    }
}
