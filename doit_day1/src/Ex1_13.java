import java.util.Scanner;

public class Ex1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0) {
                System.out.print("+");
            }else{
                System.out.print("-");
            }
        }
        System.out.println();
        for(int i =0;i<n/2;i++){
            System.out.print("+-");
        }
        if(n%2==1){
            System.out.println("+");
        }
    }
}
